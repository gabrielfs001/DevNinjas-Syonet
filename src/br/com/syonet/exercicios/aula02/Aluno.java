package br.com.syonet.exercicios.aula02;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {

	private Integer idade;
	private List<Disciplina> disciplinas;
	
	public Aluno(String nome) {
		super(nome);
		this.disciplinas = new ArrayList<>();
	}

	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public void adicionaDisciplina( Disciplina disciplina ) {
		this.disciplinas.add(disciplina);
	}
	
	public String apresentaDados() {
		String disciplinas = "";
		for (Disciplina disciplina : this.disciplinas) {
			disciplinas += disciplina + "; ";
		}
		return super.apresentaDados() 
				+ " - Idade: " + this.getIdade()
				+ " - Disciplinas: " + disciplinas;
	}
	
}
