package com.repairAutoCar.model.dao;

import javax.persistence.EntityManager;

import com.repairAutoCar.model.models.PrestadorConta;

public class PrestadorDao extends GenericaDaoPrestador<PrestadorConta, Integer>{
	
	public PrestadorDao(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}
}
