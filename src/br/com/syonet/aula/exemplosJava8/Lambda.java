package br.com.syonet.aula.exemplosJava8;

import java.util.Arrays;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nomes = Arrays.asList("Betina", "Renan", "Jonathan", "Julian", "Louise", "Gabriel", "Helio", "Matheus", "Tiago", "Augusto");
		//For each java7
		for (String nome : nomes) {
			imprimeElemento(nome);
		}
		//For each java8
		nomes.forEach(nome ->  imprimeElemento(nome));
		
		System.out.println("Lambda exemplo 2");
		nomes.forEach(Lambda::imprimeElemento);
	}
	
	public static void imprimeElemento (String elemento) {
		System.out.println( elemento );
	}


}
