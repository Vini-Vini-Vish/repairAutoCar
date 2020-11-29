package com.repairAutoCar.model.service;

import java.util.List;

import javax.persistence.EntityTransaction;

import com.repairAutoCar.estrutura.util.VariaveisProjeto;
import com.repairAutoCar.model.dao.PrestadorDao;
import com.repairAutoCar.model.models.UsuarioPrestador;

public class PrestadorContService extends ConexaoBancoService{
	
private PrestadorDao prestadorDao;
	
	public PrestadorContService() {
		this.prestadorDao = new PrestadorDao(this.getEntityManager());
	}S
	
	public Integer save(UsuarioPrestador usuarioprestador) {
		
		Integer toReturn = 0;
		
		EntityTransaction trx = this.getTransaction();
		
		if(validarDigitacao(usuarioprestador)== VariaveisProjeto.DIGITACAO_OK) {
		
			try {
				trx.begin();
				this.getUsuarioPrestador().save(usuarioprestador);
				trx.commit();
				
			}catch(Exception ex) {
				ex.printStackTrace();
				if(trx.isActive()) {
					trx.rollback();
				}
				toReturn = VariaveisProjeto.ERRO_INCLUSAO;
			}finally {
				this.close();
			}
		} else {
			toReturn = VariaveisProjeto.CAMPO_VAZIO;
		}
		
		return toReturn;
	}
	
	
	public Integer update(UsuarioPrestador usuarioprestador) {
		
		Integer toReturn =0;
		
		EntityTransaction trx = this.getTransaction();
		
		if(validarDigitacao(usuarioprestador)== VariaveisProjeto.DIGITACAO_OK) {
		
			try {
				trx.begin();
				this.getUsuarioPrestador().update(usuarioprestador);
				trx.commit();
				
			}catch(Exception ex) {
				ex.printStackTrace();
				if(trx.isActive()) {
					trx.rollback();
				}
				toReturn = VariaveisProjeto.ERRO_ALTERACAO;
			}finally {
				this.close();
			}
		} else {
			toReturn = VariaveisProjeto.CAMPO_VAZIO;
		}		
		return toReturn;
	}
	
	public Integer delete(UsuarioPrestador usuarioprestador) {
		
		Integer toReturn =0;
		
		EntityTransaction trx = this.getTransaction();		
		
			try {
				trx.begin();
				PrestadorDao usuarioEncontrado = this.getPrestadorDao().findById(prestadorDao.getid());
				this.getPrestadorDao().remove(usuarioEncontrado);
				trx.commit();
				
			}catch(Exception ex) {
				ex.printStackTrace();
				if(trx.isActive()) {
					trx.rollback();
				}
				toReturn = VariaveisProjeto.ERRO_ALTERACAO;
			}finally {
				this.close();
			}
		
		return toReturn;
	}	
	
	public PrestadorDao findById(Integer id) {
		return this.getPrestadorDao().findById(id);
	}
	
	public List<Usuario> findAll(){
		return this.getUsuarioDao().findAll(Usuario.class);
	}
	
	public Integer validarDigitacao(Usuario usuario) {
		if(VariaveisProjeto.digitacaoCampo(usuario.getUsername())) {
			return VariaveisProjeto.CAMPO_VAZIO;
		}
		
		return VariaveisProjeto.DIGITACAO_OK;
	}	

	public UsuarioDao getUsuarioDao() {
		return prestadorDao;
	}
}
