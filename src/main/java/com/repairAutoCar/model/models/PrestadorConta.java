package com.repairAutoCar.model.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;*/

@Entity
@Table(name = "TAB_PRESTADOR_USUARIO")
public class PrestadorConta {		
	
	private Integer	 id_p;
	private String	 tipe;
	private String	 namecont;
	private Integer	 agencia;
	private Integer	 conta;	
	private Integer	 operacao;
	private Integer	 codigobanco;
	
	//----------------------------------------------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PRESTADOR_ID")
	public Integer getid() {
		return id_p;
	}
	public void seiId(Integer id) {
		this.id_p = id;
	}
	//----------------------------------------------
	@Column(name = "PRESTADOR_TIPE", length = 100, nullable = false)
	public String gettipe() {
		return tipe;
	}
	public void settipe(String tipe) {
		this.tipe = tipe;
	}
	//----------------------------------------------
	@Column(name = "PRESTADOR_NAME", length = 100, nullable = false)
	public String getNamecont() {
		return namecont;
	}
	public void setNamecont(String namecont) {
		this.namecont = namecont;
	}
	//----------------------------------------------
	@Column(name = "PRESTADOR_AGENCY", length = 25, nullable = false)
	public Integer getAgencia() {
		return agencia;
	}
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}
	//----------------------------------------------
	@Column(name = "PRESTADOR_Cont", length = 25, nullable = false)
	public Integer getCont() {
		return conta;
	}
	public void setCont(Integer cont) {
		this.conta = cont;
	}
	//----------------------------------------------
	@Column(name = "PRESTADOR_OPERACION", length = 25, nullable = false)
	public Integer getOperacao() {
		return operacao;
	}
	public void setOperacao(Integer operacao) {
		this.operacao = operacao;
	}
	//----------------------------------------------
	@Column(name = "PRESTADOR_COD", length = 25, nullable = false)
	public Integer getCodigobanco() {
		return codigobanco;
	}
	public void setCodigobanco(Integer codigobanco) {
		this.codigobanco = codigobanco;
	}
	//----------------------------------------------
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_p == null) ? 0 : id_p.hashCode());
		return result;
	}
	//----------------------------------------------
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrestadorConta other = (PrestadorConta) obj;
		if (id_p == null) {
			if (other.id_p != null)
				return false;
		} else if (!id_p.equals(other.id_p))
			return false;
		return true;
	}		
		 
	@Override
	public String toString() {
		return "Usuario [id=" + id_p + ", tipe=" + tipe + ", namecont =" + namecont + ", agencia=" + agencia
				+ ", conta =" + conta + ", operacao =" + operacao + ", codigobanco =" + codigobanco + "]";
	}
}