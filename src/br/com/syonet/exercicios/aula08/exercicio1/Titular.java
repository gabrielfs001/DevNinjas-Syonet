package br.com.syonet.exercicios.aula08.exercicio1;

public class Titular {
	private String cpf;
	private String nome;
	
	public Titular(String cpf, String nome) {
		super();
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


}