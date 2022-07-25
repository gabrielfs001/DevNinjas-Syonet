package br.com.syonet.aula.classeAbstrata;

public class Diretor extends Funcionario{
	
	public double calculaSalario() {
		return this.getSalario() * 0.8;
	}
}
