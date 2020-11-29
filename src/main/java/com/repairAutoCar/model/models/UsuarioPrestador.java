package com.repairAutoCar.model.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Table(name = "TAB_USUARIO_PRESTADOR")

public class UsuarioPrestador {
	
	//Dados de Cadastro
	private String nameperson;
	private int cnpj;
	private boolean disponibilidade; // falta instanciar
	
	//Dados de Conta
	private int cpf;	
	private int agencia;
	private int conta;
	private int operacao;
	private int codigoBanco;
	
	//Dados de Cadastro
	//----------------------------------------------
	@Column(name = "NAME_PERSON", length = 100, nullable = false)
	public String getNameperson() {
		return nameperson;
	}
	public void setNameperson(String nameperson) {
		this.nameperson = nameperson;
	}
	//----------------------------------------------
	@Column(name = "PERSON_CNPJ", length = 25, nullable = false)
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	//----------------------------------------------
		
	//Dados de Conta
	//----------------------------------------------
	@Column(name = "CPF_USER", length = 12, unique = true)
	public Integer getCpf() {
		return cpf;
	}
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	//----------------------------------------------
	@Column(name = "Agency_USER")
	public Integer getAgencia() {
		return agencia;
	}
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}
	//----------------------------------------------
	@Column(name = "NUMBER_CONT")
	public Integer getConta() {
		return conta;
	}
	public void setConta(Integer conta) {
		this.conta = conta;
	}
	//----------------------------------------------
	@Column(name = "OPERACION_CONT")
	public Integer getOperacao() {
		return operacao;
	}
	public void setOperacao(Integer operacao) {
		this.operacao = operacao;
	}
	//----------------------------------------------
	@Column(name = "COD_BANK")
	public Integer getCodigoBanco() {
		return codigoBanco;
	}
	public void setCodigoBanco(Integer codigoBanco) {
		this.codigoBanco = codigoBanco;
	}
	//----------------------------------------------
	@Override
	public String toString() {
		return "UsuarioPrestador [cpf =" + cpf +", agencia=" + agencia +", "
						+ "conta=" + conta +", operacao=" + operacao +", codigoBanco =" + codigoBanco +"]";
	}
}
