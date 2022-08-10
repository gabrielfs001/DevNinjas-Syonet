package br.com.syonet.exercicios.aula05.exercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercicio4refactor {

	public static void main(String[] args) {
		// Implemente um método que recebe uma lista de veículos que possuem chassi, marca e modelo,
		//e um chassi e retorne o veículo que possua o chassi;
		Veiculo veiculo1 = new Veiculo("0050550150", "Toyota", "Corolla");
		Veiculo veiculo2 = new Veiculo("0203101055", "Nissan", "Kicks");
		Veiculo veiculo3 = new Veiculo("0102030405", "Teste1", "teste2");
		List <Veiculo> veiculos = new ArrayList <Veiculo> ();
		veiculos.add(veiculo1);
		veiculos.add(veiculo2);
		veiculos.add(veiculo3);
		
		//filtraChassi(veiculos, 0203101055).forEach(System.out::println);
	/*public static List<Veiculo> filtraChassi(List <Veiculo> veiculos, Integer chassi){
		return veiculos.stream()
			.filter(veiculo -> veiculo.getChassi().equals(chassi))
			.collect(Collectors.toList());
	}*/
	Optional < Veiculo > veiculoOptional = buscaPorChassi ( veiculos, "0050550150");{
	veiculoOptional.ifPresent (Veiculo -> {
		System.out.println(veiculo1);
	});
	}
	}
	private static Optional <Veiculo> buscaPorChassi (List <Veiculo> veiculos, String chassi){
		return veiculos.stream()
				.filter(veiculo -> veiculo.getChassi() != null)
				.filter(veiculo -> veiculo.getChassi().equals(chassi))
				.findFirst();
	}
}

