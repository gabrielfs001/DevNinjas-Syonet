package br.com.syonet.aula.exemplosAula06.peek;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	
	public Pessoa (String nome) {
		super();
		this.nome = nome;
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
	@Override
	public String toString() {
		return "Pessoa (nome= " + nome + ", sobrenome=" + sobrenome +")";
		}

}
