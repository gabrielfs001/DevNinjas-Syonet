package br.com.syonet.exercicios.aula05.exercicio5;

import java.util.List;

public class Estado {
	private String nome;
	private List<String> cidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<String> getCidade() {
		return cidade;
	}
	public void setCidade(List<String> cidade) {
		this.cidade = cidade;
	}
}
