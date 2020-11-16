package com.repairAutoCar.model.dao;

import javax.persistence.EntityManager;
import com.repairAutoCar.model.models.Usuario;

public class UsuarioDao extends GenericDao<Usuario, Integer>{

	public UsuarioDao(EntityManager entityManager) {
		super(entityManager);
	}

}
