package com.repairAutoCar.estrutura.persistencia;

import javax.persistence.EntityManagerFactory;

public class ConexaoBancoDados {
	
	private static ConexaoBancoDados CONEXAO_BANCO_DADOS;
	private static EntityManagerFactory FABRICA_CONEXAO;
	
	private ConexaoBancoDados() {
		
		if (FABRICA_CONEXAO == null) {
			FABRICA_CONEXAO = getCriarFabricaConexao();
		}		
	}
	
	public static ConexaoBancoDados getConexaoBancoDados() {
		
		if(CONEXAO_BANCO_DADOS == null) {
			CONEXAO_BANCO_DADOS = new ConexaoBancoDados();
		}
		
		return CONEXAO_BANCO_DADOS;
	}
	
	private EntityManagerFactory getCriarFabricaConexao() {
				
		return null;
	}
	
}
