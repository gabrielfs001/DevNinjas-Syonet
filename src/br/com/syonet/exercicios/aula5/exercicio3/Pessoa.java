package br.com.syonet.exercicios.aula5.exercicio3;

import java.util.Optional;

public class Pessoa {
		private String nome;
		private String sobrenome;
		private String cidade;
		private long dataNascimento;
		
		public Pessoa(String nome, String sobrenome, String cidade, long dataNascimento) {
			this.nome = nome;
			this.sobrenome = sobrenome;
			this.cidade = cidade;
			this.dataNascimento = dataNascimento;
			
		}

		public long getDataNascimento() {
			return dataNascimento;
		}
		public void setDataNascimento(long dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
		public Optional<String> getNome() {
			return Optional.ofNullable(this.nome);
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public Optional<String> getSobrenome() {
			return Optional.ofNullable(this.sobrenome);
		}

		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}
		public Optional<String> getCidade() {
			return Optional.ofNullable(this.cidade);
		}

		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
		public String toString() {
			return "Nome: " + this.nome + " " + this.sobrenome +  " - Idade: " + calculaIdade()  + " - Cidade: " + this.cidade + ".";
		}
		public Integer calculaIdade() {
			long dataAtual = System.currentTimeMillis();
			//Divide por milisegundos por dia e depois faz a divisão em 365 dias(ano)
			Integer idade = (int) (((dataAtual - dataNascimento)/86400000)/365);
			return idade;
			//return this.nome + " tem " + idade + " anos de idade";
		}
	}
