package br.com.syonet.exercicios.aula01;

public class Soma {

	/*
	 * 2 )  Soma: Dado determinado número, vocês devem efetuar a soma de 0 até 
	 * o número informado conforme o nome do método. Par: Apenas a soma de 
	 * números pares. Impar: Apenas a soma de números ímpares.
	 */
	
	public static void main(String[] args) {
		System.out.println(somaPares(8));
		System.out.println(somaImpares(8));
	}
	
	static int somaPares(int numeroMaximo) {
		int soma = 0;
		int i = 0;
		while( i <= numeroMaximo ) {
			if (i%2 == 0 ) {
				soma += i;
			}
			i++;
		}
		return soma;
	}
	
	static int somaImpares(int numeroMaximo) {
		int soma = 0;
		for (int i = 0; i <= numeroMaximo; i++) {
			if (i%2 != 0 ) {
				soma += i;
			}
		}
		return soma;
	}

}
