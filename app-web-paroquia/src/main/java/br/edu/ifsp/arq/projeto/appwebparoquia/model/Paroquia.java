package br.edu.ifsp.arq.projeto.appwebparoquia.model;

/**
 * Essa classe descreve o escopo de Paroquia na aplicacao.
 * 
 * Toda Paroquia possui o(s) campo(s):
 * Sobre, telefone e email
 * 
 * @author User
 *
 */
public class Paroquia {
	
	//Atributos
	private String sobre;
	private String telefone;
	private String email;
	
	private Endereco endereco;
	
	//Getters e Setters
	public String getSobre() {
		return sobre;
	}

	public void setSobre(String sobre) {
		this.sobre = sobre;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}	
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
