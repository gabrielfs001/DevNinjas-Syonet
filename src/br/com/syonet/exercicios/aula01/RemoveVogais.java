package br.com.syonet.exercicios.aula01;

public class RemoveVogais {

	/*
	 * 3) Remoção de caracteres: Dado um texto, vocês devem remover as vogais dele e
	 * retornar o texto sem estes caracteres;
	 */

	public static void main(String[] args) {
		String nome = "BETINA VARGAS";
		System.out.println(nome.replaceAll("[aeiouAEIOU]", ""));
	}

}
