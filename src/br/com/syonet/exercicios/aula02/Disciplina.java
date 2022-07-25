package br.com.syonet.exercicios.aula02;

public class Disciplina {
	private String nome;
	private Integer turno;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getTurno() {
		return turno;
	}
	
	public void setTurno(Integer turno) {
		this.turno = turno;
	}
	
	public String getDescricaoTurno() {
		if ( this.turno.equals(1) ) {
			return "Manhã";
		} else if ( this.turno.equals(2)) {
			return "Tarde";
		} else {
			return "Noite";
		}
	}
	public String toString() {
		return  "Turno: " + this.getDescricaoTurno() 
			+ " - " + this.getNome();
	}
	
}
