package br.com.syonet.exercicios.aula04.concessionaria;

public class Veiculo {
	private int qtdRodas;
	private int peso;
	private String cor;
	private int ano;
	private String marca;
	private String modelo;
	private String tipoVeiculo;
	private float valorVenda;
	
	public Veiculo(int qtdRodas, int peso, String cor, int ano, String marca, String modelo, String tipoVeiculo, float valorVenda) {
		this.qtdRodas = qtdRodas;
		this.peso = peso;
		this.cor = cor;
		this.ano = ano;
		this.marca = marca;
		this.modelo = modelo;
		this.tipoVeiculo = tipoVeiculo;
		this.valorVenda = valorVenda;
	}
	
	public int getQtdRodas() {
		return qtdRodas;
	}
	public void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipoVeiculo() {
		return tipoVeiculo;
	}
	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	
	public String toString() {
		return "Quantidade de rodas:" + getQtdRodas()
				+ " - Peso:" + getPeso()
				+ " - Cor:" + getCor()
				+ " - Ano:" + getAno()
				+ " - Marca:" + getMarca()
				+ " - Modelo:" + getModelo()
				+ " - Tipo Veículo:" + getTipoVeiculo()
				+ " - Valor de Venda:" + getValorVenda();
	}
}
	
