package br.com.syonet.exercicios.aula05.exercicio2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio2 {

	public static void main(String[] args) {
		// Implemente um método que recebe uma lista de nomes e um caractere e retorne apenas os nomes que iniciem com esse caractere.
		char simbolo = '#';
		List <String> nomes = Arrays.asList("#Gabriel", "$Teste", "!Aluno", "#Aluno2");
		
		nomes.stream()
			.filter(nome -> nome != null && nome != "")
			.filter(nome -> nome.charAt(0) == simbolo)
			.collect(Collectors.toList())
			.forEach( nome -> System.out.println(nome));
			
	}

}
