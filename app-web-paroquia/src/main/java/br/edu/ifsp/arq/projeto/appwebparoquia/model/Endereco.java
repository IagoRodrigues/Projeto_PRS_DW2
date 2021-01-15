package br.edu.ifsp.arq.projeto.appwebparoquia.model;

/**
 * Essa classe descreve o escopo de Endereco dos usuarios na aplicacao.
 * 
 * Todo Endereco possui o(s) campo(s):
 * Logradouro, numero, bairro, cidade e CEP
 * 
 * @author User
 *
 */
public class Endereco {
	
	//Atributos
	private String logradouro;
	private String numero;
	private String bairro;
	private String cidade;
	private String cep;
	
	//Getters e Setters
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
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}	
}
