package br.com.syonet.exerciciospoo;

import java.util.List;

public class Professor extends Pessoa {
	// TODO Auto-generated constructor stub

	private String formacao;
	private List<Disciplina> disciplinas;
	
	public Professor(String nome) {
		super(nome);
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public String getFormacao() {
		return formacao;
	}
	
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
}
