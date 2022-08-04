package br.com.syonet.exercicios.aula05.exercicio2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercicio2refactor {

	public static void main(String[] args) {
		//Implemente um método que recebe uma lista de nomes e um caractere e retorne apenas os nomes que iniciem com esse caractere.
		List <String> nomes = Arrays.asList("Gabriel", "Teste", "Aluno", "Aluno2");
		listaNomes(nomes, "A").forEach(System.out::println);
	}
	
	public static List<String> listaNomes(List <String> nomes, String letra){
		return nomes.stream()
				.filter(nome -> Optional.ofNullable(nome).isPresent())
				.filter(nome -> !nome.isEmpty())
				.filter(nome -> nome.startsWith(letra))
				.collect(Collectors.toList());
	}
}
