package br.com.syonet.exercicios.aula02;

public class Pessoa {
	private String nome;
	private String sobrenome;
	
	public Pessoa( String nome ) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String apresentaDados() {
		return this.nome + " " + this.sobrenome;
	}
}
