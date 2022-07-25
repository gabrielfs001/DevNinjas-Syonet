package br.com.syonet.exercicios.aula01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Apenas1e4 {

	/*
	 * 5) Apenas 1 e 4: Você deve fazer um método que avalia o array passado 
	 * e diz se ele só contém 1 e 4 :)
	 */
	
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		numeros.add(5);
		numeros.add(3);
		numeros.add(1);
		List<Integer> so1e4 = Arrays.asList(4,4,4);
		System.out.println(valida(numeros));
		System.out.println(valida(so1e4));
	}
	
	static boolean valida( List<Integer> numeros ) {
		for (Integer numero : numeros) {
			if ( numero != 1 && numero != 4 ) {
				return false;
			}
		}
		return true;
	}
}
