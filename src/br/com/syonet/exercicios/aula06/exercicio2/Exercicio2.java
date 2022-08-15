package br.com.syonet.exercicios.aula06.exercicio2;

import java.util.Arrays;
import java.util.List;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Veiculo> veiculos = Arrays.asList(new Veiculo("HONDA", "CIVIC", "HCB1212", "A1B2C3D4", 50000),
				new Veiculo("TOYOTA", "COROLLA", "TCB3232", "A2B3C4D5", 60000),
				new Veiculo("NISSAN", "KICKS", "NKB1234", "A3B4C5D6", 40000)
				);
		System.out.println(retornaSomaValores(veiculos));
	}
	
	private static Integer retornaSomaValores( List <Veiculo> veiculos ) {
		Integer valoresVeiculos = veiculos.stream()
			.map(veiculo -> veiculo.getValor())
			.reduce(0, Integer::sum);

		return valoresVeiculos;
	}
	
}
