package br.com.syonet.exercicios.aula04.concessionaria;

public class Caminhao extends Veiculo{
	private String tipoCarroceria;
	
	public Caminhao(int qtdRodas, int peso, String cor, int ano, String marca, String modelo, String tipoVeiculo,
			float valorVenda, String tipoCarroceria) {
		super(qtdRodas, peso, cor, ano, marca, modelo, tipoVeiculo, valorVenda);
		this.tipoCarroceria = tipoCarroceria;
		// TODO Auto-generated constructor stub
	}
	public String getTipoCarroceria() {
		return tipoCarroceria;
	}

	public void setTipoCarroceria(String tipoCarroceria) {
		this.tipoCarroceria = tipoCarroceria;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - Tipo de Carroceria: " + getTipoCarroceria();
	}
}
