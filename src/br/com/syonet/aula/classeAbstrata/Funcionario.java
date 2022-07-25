package br.com.syonet.aula.classeAbstrata;

public abstract class Funcionario {
	private String nome;
	private Integer idade;
	private double salario;
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public double calculaSalario() {
		return salario;
	}
}
