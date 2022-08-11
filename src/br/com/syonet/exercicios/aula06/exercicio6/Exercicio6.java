package br.com.syonet.exercicios.aula06.exercicio6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Veiculo> veiculos = Arrays.asList(new Veiculo("HONDA", "CIVIC", "HCB1212", "A1B2C3D4", 50000),
				new Veiculo("TOYOTA", "COROLLA", "TCB3232", "A2B3C4D5", 60000),
				new Veiculo("NISSAN", "KICKS", "NKB1234", "A3B4C5D6", 40000)
				);
		List <Veiculo> veiculosPorValor = ordenaVeiculosPorValor(veiculos);;
		(veiculosPorValor).forEach(System.out::println);;
		
	}
	private static List<Veiculo> ordenaVeiculosPorValor(List<Veiculo> veiculos){
		Comparator<Veiculo> comparator = Comparator.comparing( Veiculo::getValor);
		return veiculos.stream()
				.sorted(comparator.reversed())
				.collect(Collectors.toList());
	}
}
