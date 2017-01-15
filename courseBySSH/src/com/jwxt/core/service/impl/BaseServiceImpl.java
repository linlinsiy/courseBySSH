package com.jwxt.core.service.impl;

import java.util.List;


import com.jwxt.core.dao.BaseDao;
import com.jwxt.core.service.BaseService;

public abstract class BaseServiceImpl<T> implements BaseService<T> {

	private BaseDao<T> baseDao;
	
	public void setBaseDao(BaseDao<T> baseDao) {
		this.baseDao = baseDao;
	}
	
	@Override
	public void save(T entity) {
		baseDao.save(entity);
	}

	@Override
	public void update(T entity) {
		baseDao.update(entity);
	}

	@Override
	public void delete(int id) {
		baseDao.delete(id);
	}

	@Override
	public List<T> findObjects() {
		return baseDao.findObjects();
	}

	@Override
	public T findObjectById(int id) {
		return baseDao.findObjectById(id);
	}


}
