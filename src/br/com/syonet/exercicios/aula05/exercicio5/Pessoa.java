package br.com.syonet.exercicios.aula05.exercicio5;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Pessoa {
		private String nome;
		private String sobrenome;
		private LocalDate dataNascimento;
		private String uf;
		private String cidade;
		
		public Pessoa(String nome, String sobrenome, LocalDate dataNascimento, String uf, String cidade) {
			super();
			this.nome = nome;
			this.sobrenome = sobrenome;
			this.dataNascimento = dataNascimento;
			this.uf = uf;
			this.cidade = cidade;
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
		public LocalDate getDataNascimento() {
			return dataNascimento;
		}
		public void setDataNascimento(LocalDate dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
		public String getUf() {
			return uf;
		}
		public void setUf(String uf) {
			this.uf = uf;
		}
		public String getCidade() {
			return cidade;
		}
		public void setCidade(String cidade) {
			this.cidade = cidade;
		}

}
		