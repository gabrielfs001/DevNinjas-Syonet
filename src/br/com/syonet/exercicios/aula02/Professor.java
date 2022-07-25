package br.com.syonet.exercicios.aula02;

import java.util.List;

public class Professor extends Pessoa {

	private String formacao;
	private List<Disciplina> disciplinas;
	
	public Professor(String nome, List<Disciplina> disciplinas) {
		super(nome);
		this.disciplinas = disciplinas;
	}

	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
}
