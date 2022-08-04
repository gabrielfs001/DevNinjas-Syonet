package br.com.syonet.exercicios.aula05.exercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import br.com.syonet.aula.exemplosJava8.Pessoa;

public class Exercicio1 {

	public static void main(String[] args) {
		//  Implemente um método que recebe uma lista de números e retorne eles ordenados.
		List<Integer> numeros = Arrays.asList(2,5,1,7,9,4);
		numeros.stream()
		.sorted()
		.collect(Collectors.toList())
		.forEach( numero -> System.out.println(numero));
	}
}
