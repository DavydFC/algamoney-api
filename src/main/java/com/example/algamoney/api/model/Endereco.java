package com.example.algamoney.api.model;

import javax.persistence.Embeddable;
import javax.validation.constraints.Size;

@Embeddable
public class Endereco {

	@Size(min = 0, max = 100)
	private String logradouro;
	@Size(min = 0, max = 10)
	private String numero;
	@Size(min = 0, max = 20)
	private String complemento;
	@Size(min = 0, max = 11)
	private String cep;
	@Size(min = 0, max = 60)
	private String bairro;
	@Size(min = 0, max = 60)
	private String cidade;
	@Size(min = 0, max = 3)
	private String estado;
	
	
	
	public Endereco() {
		super();
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public Endereco(String logradouro, String numero, String complemento, String cep, String bairro, String cidade,
			String estado) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	
}
