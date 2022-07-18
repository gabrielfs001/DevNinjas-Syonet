package br.com.syonet.exerciciospoo;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{
	private Integer idade;
	private List<Disciplina> disciplinas;

	public Aluno (String nome) {
		super(nome);
		this.disciplinas = new ArrayList<>();
	};
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public Integer getIdade() {
		return idade;
	}
	public void setIdade (Integer idade) {
		this.idade = idade;
	}
	
	public void adicionaDisciplina (Disciplina disciplina) {
		this.disciplinas.add(disciplina);
	}
	
	public String insereDados() {
		String disciplinas = "";
		for (Disciplina disciplina : this.disciplinas) {
			disciplinas += disciplina + " ";
		}
		return super.insereDados()
				+ " - Idade: " + this.getIdade()
				+ " Disciplinas: " + disciplinas;
	}
}
