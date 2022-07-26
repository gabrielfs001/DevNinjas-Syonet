package br.com.syonet.exercicios.aula04.pessoa;

import java.text.SimpleDateFormat;

/*Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de nascimento e altura. 
Crie os métodos públicos necessários para sets e gets e também um método para imprimir todos dados de uma pessoa.
Crie um método para calcular a idade da pessoa.*/

public class Pessoa {
	private String nome;
	private long dataNascimento;
	private Integer altura;
	
	public Pessoa(String nome, long dataNascimento, Integer altura) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.altura = altura;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(long dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Integer getAltura() {
		return altura;
	}
	public void setAltura(Integer altura) {
		this.altura = altura;
	}
	public String apresentaDados() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String nascimentoF = sdf.format(this.dataNascimento);
		return "Nome: " + this.nome + " - Nascimento: " + nascimentoF  + " - Altura: " + this.altura + "cm.";
	}
	public String calculaIdade() {
		long dataAtual = System.currentTimeMillis();
		//Divide por milisegundos por dia e depois faz a divisão em 365 dias(ano)
		long idade = (((dataAtual - dataNascimento)/86400000)/365);
		return this.nome + " tem " + idade + " anos de idade";
	}

	

	
	
}
