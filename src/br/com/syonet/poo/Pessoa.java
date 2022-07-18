package br.com.syonet.poo;

import java.util.Date;

public class Pessoa {
	//POO
	
	//Declaração de Atributos
	//Tipos de visibilidade dos atributos: private/public/protected - Tipo_Atributo - Nome_Atributo;
	private String nome;
	private Date dataNascimento;
	private String cidade;
	
	//Possui um
	private Carro carro;
	
	public Pessoa (String nome, Date dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	//Assinatura Metodos
	//Tipos de visibilidade dos metodos: private/public/protected - Tipo_Retorno - Nome_Metodo ( parametros ) {
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public boolean validaNome(String nomeParametro) {
		if (nomeParametro != "") {
			return true;
		}
		return false;
	}
	
	public Carro getCarro() {
		return carro;
	}
	
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
}

