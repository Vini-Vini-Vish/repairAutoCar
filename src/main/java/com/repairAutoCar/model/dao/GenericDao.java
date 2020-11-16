package com.repairAutoCar.model.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import javax.persistence.EntityManager;

public abstract class GenericDao<DADO, Id extends Serializable>{
	
	private EntityManager entityManager;	
	
	private final Class<DADO> classePersistencia;
	
	@SuppressWarnings("unchecked")
	public GenericDao(EntityManager entityManager) {
	this.entityManager = entityManager;
	this.classePersistencia = (Class<DADO>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public void save(DADO entity) {
		this.getEntityManager().persist(entity);
	}
	
	public void update(DADO entity) {
		this.getEntityManager().merge(entity);
	}
	
	public void remove(DADO entity) {
		this.getEntityManager().remove(entity);
	}
	
	public DADO findById(Id id) {
		return this.getEntityManager().find(getClassePersistencia(), id);
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public Class<DADO> getClassePersistencia() {
		return classePersistencia;
	}	
}