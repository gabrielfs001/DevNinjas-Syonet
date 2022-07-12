package br.com.syonet;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 7;
		int somaNumerosPar = 0;
		
			for (int i = 0; i <= numero; i++) {
				if ((i % 2) == 0) {
					somaNumerosPar = somaNumerosPar + i;
				}
			}
			System.out.println("A soma dos números pares é: " + somaNumerosPar);
		
		int somaNumerosImpar = 0;
			
			for (int i = 0; i <= numero; i++) {
				if ((i % 2) != 0) {
					somaNumerosImpar = somaNumerosImpar + i;
				}
			}
				System.out.println("A soma dos números impares é: " + somaNumerosImpar);
		
	}

}
