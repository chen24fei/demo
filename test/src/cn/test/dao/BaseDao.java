package cn.test.dao;

import java.io.Serializable;
import java.util.List;

/**
 * dao�ӿ�
 * @author Administrator
 *
 * @param <T>
 */
public interface BaseDao<T> {
	/**
	 * �������
	 * @param t
	 */
	void saveEntity(T t);
	/**
	 * ���¶���
	 */
	void updateEntity(T t);
	/**
	 * ɾ������
	 * @param t
	 */
	void deleteEntity(T t);
	/**
	 * ����������������
	 * @param hql  hql���
	 * @param objects ����
	 */
	int batchHandleByHql(String hql,Serializable...serializables);
	/**
	 * ��ѯ����
	 * @param t
	 * @return
	 */
	T getEntity(Serializable t);
	/**
	 * ͨ��hql��ѯ���󼯺�
	 * @param hql
	 * @param objects
	 * @return
	 */
	List<T> findEntityByHQL(String hql,Serializable...serializables);
}
