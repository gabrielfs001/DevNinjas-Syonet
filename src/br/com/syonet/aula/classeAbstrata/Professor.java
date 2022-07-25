package br.com.syonet.aula.classeAbstrata;

public class Professor extends Funcionario{
	private String carro;

	public String getCarro() {
		return carro;
	}

	public void setCarro(String carro) {
		this.carro = carro;
	}
	
	@Override
	public double calculaSalario() {
		return this.getSalario() * 0.5;
	}
}
