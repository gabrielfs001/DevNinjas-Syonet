package br.com.syonet.aula.exemplosAula06.reduce;

import java.util.Arrays;
import java.util.List;

public class ExemploReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> numeros = Arrays.asList( 1,2,3,4,5,6,7,7,7,8,8,8);
		Integer somaTotal = numeros.stream()
			.reduce(0, (subtotal, elemento) -> {
			System.out.println("O subtotal para o elemento " + elemento + " é " + subtotal);
			return subtotal + elemento;
		});
		System.out.println(somaTotal);
		
		Integer numerosReduzidos = numeros.stream()
			.reduce(0, Integer::sum);
		System.out.println( numerosReduzidos);

	}
}
