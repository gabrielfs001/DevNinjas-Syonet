package br.com.syonet.exercicios.aula03.imobiliaria;

public class Imovel {
	private Float valorVenda;
	private Integer areaImovel;
	
	public Imovel(Float valorVenda, Integer areaImovel) {
		this.valorVenda = valorVenda;
		this.areaImovel = areaImovel;
	}
	
	public Float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(Float valorVenda) {
		this.valorVenda = valorVenda;
	}
	public Integer getAreaImovel() {
		return areaImovel;
	}
	public void setAreaImovel(Integer areaImovel) {
		this.areaImovel = areaImovel;
	}
	
	public String toString() {
		return "Area do imovel: " + this.getAreaImovel() 
			+ "\nValor do imovel: R$" + this.getValorVenda(); 
	}
	
}
