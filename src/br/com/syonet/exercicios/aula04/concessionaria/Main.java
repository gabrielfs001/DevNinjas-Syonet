package br.com.syonet.exercicios.aula04.concessionaria;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concessionaria concessionaria1 = new Concessionaria("Syonet");
		List<Veiculo> veiculos = new ArrayList<>();
		//int qtdRodas, int peso, String cor, int ano, String marca, String modelo, String tipoVeiculo, float valorVenda
		concessionaria1.adicionaVeiculo(4, 500, "Vermelho", 1997, "Toyota", "Corolla", "Novos", 150000);
		concessionaria1.adicionaVeiculo(4, 700, "Branco", 2000, "Nissan", "Kicks", "Novos", 100000);
		concessionaria1.adicionaCarro(4, 700, "Branco", 2020, "Nissan", "March", "Novos", 100000);
		concessionaria1.adicionaCarro(4, 700, "Preto", 2016, "Nissan", "Kicks", "Seminovos", 100000);
		concessionaria1.adicionaMoto(4, 700, "Preto", 2016, "Yamaha", "Twister", "Seminovos", 100000, 150);
		concessionaria1.adicionaMoto(4, 700, "Preto", 2016, "Honda", "Fazer", "Seminovos", 100000, 125);
		concessionaria1.adicionaCaminhao(4, 700, "Preto", 2016, "Mercedez", "Benz", "Seminovos", 100000, "Truck");
		concessionaria1.adicionaCaminhao(4, 700, "Preto", 2016, "BMW", "BR", "Seminovos", 100000, "Truck");
		//System.out.println("Concessionária: " + concessionaria1.getNome() + "\n" + concessionaria1.listaVeiculos());
		System.out.println(concessionaria1.listaCarros("Ambos"));
		System.out.println(concessionaria1.listaMotos("Honda", 125));
		System.out.println(concessionaria1.listaCaminhao("Truck"));
		System.out.println(concessionaria1.atualizaPreco("Mercedez", "Benz", 150000));
		System.out.println(concessionaria1.listaCaminhao("Truck"));
		System.out.println(concessionaria1.vendeVeiculo("PNE", "Honda", "Fazer"));
	}

}
