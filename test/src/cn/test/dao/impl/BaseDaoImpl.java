package cn.test.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import cn.test.dao.BaseDao;

public abstract class BaseDaoImpl<T>  implements BaseDao<T> {
	private Class<T> clazz;
	@SuppressWarnings("unchecked")
	public BaseDaoImpl(){
		ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
		clazz = (Class<T>) type.getClass();
	}

	private SessionFactory sessionFactory;

	public int batchHandleByHql(String hql,Serializable...serializables) {
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		for(int i = 0;i<serializables.length;i++){
			q.setParameter(i, serializables[i]);
		}
		return q.executeUpdate();
	}

	public void deleteEntity(T t) {
		sessionFactory.getCurrentSession().delete(t);
	}

	@SuppressWarnings("unchecked")
	public List<T> findEntityByHQL(String hql, Serializable...serializables) {
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		for(int i = 0;i<serializables.length;i++){
			q.setParameter(i, serializables[i]);
		}
		return q.list();
	}

	@SuppressWarnings("unchecked")
	public T getEntity(Serializable id) {
		return (T) sessionFactory.getCurrentSession().get(clazz, id);
	}

	public void saveEntity(T t) {
		sessionFactory.getCurrentSession().save(t);
	}

	public void updateEntity(T t) {
		sessionFactory.getCurrentSession().update(t);
	}
	/**
	 * ×¢ÈësessionFactory
	 * @param sessionFactory
	 */
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
