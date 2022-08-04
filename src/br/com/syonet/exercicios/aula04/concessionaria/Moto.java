package br.com.syonet.exercicios.aula04.concessionaria;

public class Moto extends Veiculo{
	private int cilindrada;
	
	public Moto(int qtdRodas, int peso, String cor, int ano, String marca, String modelo, String tipoVeiculo,
			float valorVenda, int cilindrada) {
		super(qtdRodas, peso, cor, ano, marca, modelo, tipoVeiculo, valorVenda);
		this.cilindrada = cilindrada;
		// TODO Auto-generated constructor stub
	}
	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - Cilindrada: " + getCilindrada();
	}
}
