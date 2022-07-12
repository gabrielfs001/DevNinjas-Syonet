package br.com.syonet;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] meuArray = {1,2,4,4};
		boolean teste1e4 = true;
		
		for (int i = 0; i < meuArray.length; i++) {
			if (meuArray[i] == 1) {
			}else if(meuArray[i] == 4) {
			}else {
				teste1e4 = false;
			}
		}
		if (teste1e4 == true) {
			System.out.println("O array só contem números 1 e 4");
		}else {
			System.out.println("O array contém outros número além de 1 e 4");
		}
	}

}
