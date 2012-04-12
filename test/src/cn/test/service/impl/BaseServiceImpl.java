package cn.test.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import cn.test.dao.BaseDao;
import cn.test.service.BaseService;

public class BaseServiceImpl<T> implements BaseService<T> {
	private BaseDao<T> dao;
	
	@Resource
	public void setDao(BaseDao<T> dao) {
		this.dao = dao;
	}
	public void saveEntity(T t) {
		dao.saveEntity(t);
	}
	public void batchHandle(String hql, Serializable... serializables) {
		dao.batchHandleByHql(hql, serializables);
	}
	public void deleteEntity(T t) {
		dao.deleteEntity(t);
	}
	public List<T> findEntityByHQL(String hql, Serializable... serializables) {
		return dao.findEntityByHQL(hql, serializables);
	}
	public T getEntity(Serializable id) {
		return dao.getEntity(id);
	}
	public void updateEntity(T t) {
		dao.updateEntity(t);
	}

}
