package br.com.syonet.exercicios.aula03.imobiliaria;

public class Terreno extends Imovel {

	public Terreno(Float valorVenda, Integer areaImovel) {
		super(valorVenda, areaImovel);
	}

	@Override
	public String toString() {
		return "Terreno:\n" + super.toString();
	}
}
