package br.com.syonet.exercicios.aula03.imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {
	private String nome;
	private String endereco;
	private List<Imovel> imoveis = new ArrayList<>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public List<Imovel> getImoveis() {
		return imoveis;
	}
	public void setImoveis(List<Imovel> imoveis) {
		this.imoveis = imoveis;
	}
	
	public String exibeDetalhesDosImoveis() {
		String retorno = "";
		for (Imovel imovel : this.getImoveis()) {
			retorno += imovel + "\n";
		}
		return retorno;
	}
	
	public String listaCasas() {
		String retorno = "";
		for (Imovel imovel : this.getImoveis()) {
			if ( imovel instanceof Casa ) {
				retorno += imovel + "\n";
			}
		}
		return retorno;
	}
	
	public String listaApartamentos() {
		String retorno = "";
		for (Imovel imovel : this.getImoveis()) {
			if ( imovel instanceof Apartamento ) {
				retorno += imovel + "\n";
			}
		}
		return retorno;
	}
	
	public String listaTerreno() {
		String retorno = "";
		for (Imovel imovel : this.getImoveis()) {
			if ( imovel instanceof Terreno ) {
				retorno += imovel + "\n";
			}
		}
		return retorno;
	}
}
