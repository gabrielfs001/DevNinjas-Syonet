package br.com.syonet.exercicios.aula05.exercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio1refactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> numerosTeste = Arrays.asList(3,2,5,1,7,9,4,2);
		ordenaNumeros(numerosTeste).forEach(System.out::println);
	}
	public static List<Integer> ordenaNumeros(List<Integer> numeros) {
		return numeros.stream().sorted().collect(Collectors.toList());
	}
}
