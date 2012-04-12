package cn.test.service;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T> {
	/**添加实体*/
	void saveEntity(T t);
	/**删除实体*/
	void deleteEntity(T t);
	/**修改实体*/
	void updateEntity(T t);
	/**根据ID获取实体*/
	T getEntity(Serializable id);
	/**
	 * 根据hql,获取实体列表
	 * @param hql  hql
	 * @param serializables 参数
	 * @return
	 */
	List<T> findEntityByHQL(String hql,Serializable...serializables);
	/**
	 * 批量操作
	 * @param hql
	 * @param serializables 参数
	 */
	public void batchHandle(String hql,Serializable...serializables);
}
