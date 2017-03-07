package com.jwxt.core.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.jwxt.core.dao.BaseDao;

public class BaseDaoImpl<T> extends HibernateDaoSupport  implements BaseDao<T> {


	Class<T> clazz;
	public BaseDaoImpl(){
		//带参数的,这里的this是实例化对象的那个子类
		ParameterizedType pt = (ParameterizedType)this.getClass().getGenericSuperclass();//UserDaoImpl<User>
		clazz = (Class<T>)pt.getActualTypeArguments()[0];
	}
	
	public Session getCurrentSession(){
		return getHibernateTemplate().getSessionFactory().getCurrentSession();
	}
	
	@Override
	public void save(T entity) {
		getHibernateTemplate().save(entity);
	}

	@Override
	public void update(T entity) {
		getHibernateTemplate().update(entity);
	}

	@Override
	public void delete(int id) {
		getHibernateTemplate().delete(findObjectById(id));
	}

	@Override
	public List<T> findObjects() {
		Query query = getCurrentSession().createQuery("FROM "+clazz.getSimpleName());
		return query.list();
	}

	@Override
	public T findObjectById(int id) {
		return getHibernateTemplate().get(clazz, id);
	}

}
