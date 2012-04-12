package cn.test.service;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T> {
	/**���ʵ��*/
	void saveEntity(T t);
	/**ɾ��ʵ��*/
	void deleteEntity(T t);
	/**�޸�ʵ��*/
	void updateEntity(T t);
	/**����ID��ȡʵ��*/
	T getEntity(Serializable id);
	/**
	 * ����hql,��ȡʵ���б�
	 * @param hql  hql
	 * @param serializables ����
	 * @return
	 */
	List<T> findEntityByHQL(String hql,Serializable...serializables);
	/**
	 * ��������
	 * @param hql
	 * @param serializables ����
	 */
	public void batchHandle(String hql,Serializable...serializables);
}
