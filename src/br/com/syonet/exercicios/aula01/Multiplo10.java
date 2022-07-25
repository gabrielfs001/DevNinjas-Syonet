package br.com.syonet.exercicios.aula01;

import java.util.Arrays;
import java.util.List;

public class Multiplo10 {

	/*
	 * 6) Múltiplos de 10: Dado array, você deve avaliar cada posição. 
	 * Quando encontrar um múltiplo de 10, você deve substituir os próximos 
	 * valores por esse múltiplo. Caso encontre outro, o valor deve mudar para 
	 * este novo múltiplo. 
	 * Ex: 1, 10, 11, 20, 12 -> 1, 10, 10, 20, 20.
	 */

	public static void main(String[] args) {
		List< Integer > numeros = Arrays.asList(1, 10, 11, 20, 12);
		Integer[] arrayNumeros = {5, 9, 10, 14, 15, 20,15};
		String resultado = "";
		for (Integer numero : iteraMultiplos10(numeros) ) {
			resultado+= numero + ", ";
		}
		System.out.println("Resultado 1: " + resultado );
		avaliaArrayMultiplos(arrayNumeros);
	}
	
	static List<Integer> iteraMultiplos10( List< Integer > numeros ) {
		int multiplo = 0;
		for (int i = 0; i < numeros.size(); i++) {
			if ( numeros.get(i) % 10 == 0 ) {
				multiplo = numeros.get(i);
			} else if ( multiplo != 0) {
				numeros.set(i, multiplo);
			}
		}
		return numeros;
	}
	
	private static void avaliaArrayMultiplos(Integer[] array) {
		Integer[] newArray = new Integer[array.length];
		for (int i = 0; i < array.length; i++) {
			if(newArray[i] != null) continue;
			newArray[i] = array[i];
			if (array[i] % 10 == 0) {
				newArray[i + 1] = array[i];
			}
		}
		System.out.print("newArray = {");
		for(Integer number : newArray)
			System.out.print(number + ", ");
		System.out.println("};");

	}


}
