package com.project.dao;

import org.springframework.transaction.annotation.Transactional;

public interface GenericDao {

	<T> T save(Object obj);

	<T> T fetchById(Class<T> clazz, Object id);

}