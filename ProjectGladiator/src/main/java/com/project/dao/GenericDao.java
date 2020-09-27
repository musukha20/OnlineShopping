package com.project.dao;

public interface GenericDao {

	public <T> T save(Object obj);
	public <T> T fetchById(Class<T> clazz, Object id);

}
