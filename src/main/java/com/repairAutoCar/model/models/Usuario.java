package com.repairAutoCar.model.models;

//----------------------------------------------
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.repairAutoCar.model.models.Usuario;
//----------------------------------------------

@Entity
@Table(name = "TAB_USUARIO")
public class Usuario {		
		
	private Integer id;	
	private String username;
	private String email;
	private String password;
	
	// Teste de inserção de dados do cadastro
	private Integer cpf;	
	private Integer agencia;
	private Integer conta;
	private Integer operacao;
	private Integer codigoBanco;	
	//	
	
	private boolean ativo = true;
	private boolean admin = false;
	
	//----------------------------------------------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USUARIO_ID")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	//----------------------------------------------
	@Column(name = "USUARIO_USERNAME", length = 60, nullable = false)
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	//----------------------------------------------
	@Column(name = "USUARIO_EMAIL", length = 100, nullable = false, unique = true)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//----------------------------------------------
	@Column(name = "USUARIO_PASSWORD", length = 100, nullable = false)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//----------------------------------------------
	// Teste de processamento de dados do cadastro
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
	// Fim teste 
	//----------------------------------------------
	@Column(nullable = false)
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	//----------------------------------------------
	@Column(nullable = false)
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	//----------------------------------------------
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}		
	//----------------------------------------------
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", ativo=" + ativo + ", admin=" + admin + ", cpf =" + cpf +", agencia=" + agencia +", "
						+ "conta=" + conta +", operacao=" + operacao +", codigoBanco =" + codigoBanco +"]";
	}
	//----------------------------------------------	
}
