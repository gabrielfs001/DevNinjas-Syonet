package br.com.syonet.exercicios.aula06.exercicio3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Veiculo> veiculos = Arrays.asList(new Veiculo("HONDA", "CIVIC", "HCB1212", "A1B2C3D4", 50000),
				new Veiculo("TOYOTA", "COROLLA", "TCB3232", "A2B3C4D5", 60000),
				new Veiculo("NISSAN", "KICKS", "NKB1234", "A3B4C5D6", 40000)
				);
		alteraPlacas(veiculos).forEach(System.out::println);
	}
	
	private static List<Veiculo> alteraPlacas(List<Veiculo> veiculos) {
		return veiculos.stream()
				.peek(veiculo -> veiculo.setPlaca("ABC1234"))
				.collect(Collectors.toList());
	}
	
	
}
