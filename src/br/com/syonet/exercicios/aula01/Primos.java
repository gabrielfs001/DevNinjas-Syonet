package br.com.syonet.exercicios.aula01;

public class Primos {

	/*
	 * 4) Primos: Implemente o método da classe Primos para retornar se o 
	 * número informado é primo.
	 */
	public static void main(String[] args) {
		System.out.println( isPrimo(1) );
		System.out.println( isPrimo(7) );
		System.out.println( isPrimo(9) );
		System.out.println( isPrimo(15));
		System.out.println( isPrimo(17) );

		System.out.println( isPrimo(49) );
		
	}
	static boolean verificaNumeroPrimo( int numero ) {
		if ( numero <= 1 ) {
			return false;
		}
		//1 
		//por ele mesmo
		for (int i = 2; i < numero  ; i++ ) {
			if ( numero % i == 0 ) {
				return false;
			}
		}
		return true;
	}
	
	static boolean isPrimo(int n) {
		if (n % 2 == 1) {
			System.out.println(n + " é primo");
			return true;
		} else {
			System.out.println(n + " não e primo");
			return false;
		}
	}


}
