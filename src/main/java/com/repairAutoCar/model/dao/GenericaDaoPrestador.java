package com.repairAutoCar.model.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public abstract class GenericaDaoPrestador <PrestadorConta, Id extends Serializable>{
private EntityManager entityManager;	
	
	private final Class<PrestadorConta> classePersistencia;
	
	@SuppressWarnings("unchecked")
	public GenericaDaoPrestador(EntityManager entityManager) {
	this.entityManager = entityManager;
	this.classePersistencia = (Class<PrestadorConta>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public void save(PrestadorConta entity) {
		this.getEntityManager().persist(entity);
	}
	
	public void update(PrestadorConta entity) {
		this.getEntityManager().merge(entity);
	}
	
	public void remove(PrestadorConta entity) {
		this.getEntityManager().remove(entity);
	}
	
	public PrestadorConta findById(Id id) {
		return this.getEntityManager().find(getClassePersistencia(), id);
	}
	
	@SuppressWarnings("unchecked")
	 public List<PrestadorConta> findAll(Class<PrestadorConta> classe){
		 List<PrestadorConta> lista = new ArrayList<>();
		 Query query = this.getEntityManager().createQuery("SELECT o FROM "+classe.getSimpleName()+" o");
		 
		 lista = query.getResultList();
		 
		 return lista;		 
	 }
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public Class<PrestadorConta> getClassePersistencia() {
		return classePersistencia;
	}
}
