package cn.test.dao;

import java.io.Serializable;
import java.util.List;

/**
 * dao接口
 * @author Administrator
 *
 * @param <T>
 */
public interface BaseDao<T> {
	/**
	 * 保存对象
	 * @param t
	 */
	void saveEntity(T t);
	/**
	 * 更新对象
	 */
	void updateEntity(T t);
	/**
	 * 删除对象
	 * @param t
	 */
	void deleteEntity(T t);
	/**
	 * 根据条件批量操作
	 * @param hql  hql语句
	 * @param objects 参数
	 */
	int batchHandleByHql(String hql,Serializable...serializables);
	/**
	 * 查询对象
	 * @param t
	 * @return
	 */
	T getEntity(Serializable t);
	/**
	 * 通过hql查询对象集合
	 * @param hql
	 * @param objects
	 * @return
	 */
	List<T> findEntityByHQL(String hql,Serializable...serializables);
}
