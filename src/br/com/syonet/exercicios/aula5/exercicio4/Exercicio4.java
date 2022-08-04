package br.com.syonet.exercicios.aula5.exercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Exercicio4 {

	public static void main(String[] args) {
		// Implemente um método que recebe uma lista de veículos que possuem chassi, marca e modelo,  e um chassi e retorne o veículo que possua o chassi;
		Veiculo veiculo1 = new Veiculo(null, "Toyota", "Corolla");
		Veiculo veiculo2 = new Veiculo(020310105, "Nissan", "Kicks");
		Veiculo veiculo3 = new Veiculo(0102030405, "Teste1", "teste2");
		List <Veiculo> veiculos = new ArrayList <Veiculo> ();
		veiculos.add(veiculo1);
		veiculos.add(veiculo2);
		veiculos.add(veiculo3);
		
		List<Veiculo> filtraChassi = veiculos.stream()
				.filter (veiculo -> veiculo.getChassi() != null)
				.collect(Collectors.toList());
			
			filtraChassi.forEach(System.out::println);
			System.out.println("----------------");
		}
	}

