package br.com.syonet.exercicios.aula03.imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Imovel> imoveis = new ArrayList<>();
		imoveis.add(new Casa(60f, 100, 5, 40));
		imoveis.add(new Casa(70f, 200, 3, 50));
		imoveis.add(new Apartamento(550f, 90, true, 2));
		imoveis.add(new Casa(200f, 300, 7, 90));
		imoveis.add(new Apartamento(50f, 80, false, 9));
		imoveis.add(new Terreno(80f, 115));
		
		Imobiliaria imobiliaria = new Imobiliaria();
		imobiliaria.setEndereco("Ramiro Barcelos");
		imobiliaria.setNome("Imobiliaria");
		imobiliaria.setImoveis(imoveis);
		
		System.out.println( imobiliaria.getNome() + "\n" 
				+ imobiliaria.exibeDetalhesDosImoveis() );
		System.out.println( "Casas\n" + imobiliaria.listaCasas());
		System.out.println( "Apartamentos\n" + imobiliaria.listaApartamentos());
		System.out.println( "Terrenos\n" + imobiliaria.listaTerreno() );
		
	}

}
