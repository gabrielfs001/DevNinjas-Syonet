package br.com.syonet.exercicios.aula05.exercicio5;

import java.util.List;
import java.util.Optional;

public class Pessoa {
		private String nome;
		private String sobrenome;
		private List<Estado> estado;
		private long dataNascimento;
		
		public Pessoa(String nome, String sobrenome, List<String> cidade, long dataNascimento) {
			this.nome = nome;
			this.sobrenome = sobrenome;
			this.dataNascimento = dataNascimento;
			
		}

		
		public List<Estado> getEstado() {
			return estado;
		}
		public void setEstado(List<Estado> estado) {
			this.estado = estado;
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
		public String toString() {
			return "Nome: " + this.nome + " " + this.sobrenome;
		}
	}
