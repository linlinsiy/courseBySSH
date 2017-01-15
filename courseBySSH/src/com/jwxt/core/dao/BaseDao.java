package com.jwxt.core.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {
	//新增
	public void save(T entity);
	//更新
	public void update(T entity);
	//根据id删除
	public void delete(int id);
	//查询列表
	public List<T> findObjects();
	//根据id查询
	public T findObjectById(int id);
}
