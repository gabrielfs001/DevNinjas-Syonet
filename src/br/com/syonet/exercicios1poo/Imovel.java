package br.com.syonet.exercicios1poo;

public class Imovel {
	private float valorImovel;
	private float areaImovel;
	
	public Imovel (float valorImovel, float areaImovel) {
		this.valorImovel = valorImovel;
		this.areaImovel = areaImovel;
		
	}
	
	public float getValorImovel() {
		return valorImovel;
	}
	
	public void setValorImovel(float valorImovel) {
		this.valorImovel = valorImovel;
	}
	
	public float getAreaImovel() {
		return areaImovel;
	}
	
	public void setAreaImovel(float areaImovel) {
		this.areaImovel = areaImovel;
	}
	
	public String exibeInfo() {
		return "Valor do Imóvel: R$" +
			this.valorImovel +
			" - Área do Imóvel: " +
			this.areaImovel + "m²";
	}
	
}
