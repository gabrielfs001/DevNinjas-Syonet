package br.com.syonet.aula.exemplosJava8;

import java.util.Optional;

public class Pessoa {
	private String nome;
	private String sobrenome;

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
}
