package br.com.syonet;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroTeste = 1;
		if (ehPrimo(numeroTeste)) {
			System.out.println(numeroTeste + " É um número primo");
		}else {
			System.out.println(numeroTeste + " Não é um número primo");
		}
	}
	
	
		public static boolean ehPrimo(int numero) {
			//Esse if é da correção	
			if ( numero <= 1) {
				return false;
			}
			for (int i = 2; i < numero; i++) {
				if (numero % i == 0)
					return false;
			}
			return true;
		}

}
