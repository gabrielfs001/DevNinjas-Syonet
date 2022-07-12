package br.com.syonet;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] meuArray = {1,40,4,20,5};
		
		for (int i = 0; i < meuArray.length; i++) {
			if (meuArray[i] % 10 == 0) {
				meuArray[i+1] = meuArray[i];
				i++;
			}
		}
		for (int j = 0; j < meuArray.length; j++) {
			System.out.println(meuArray[j]);
		}
	}
}
