package br.com.syonet.aula.exemplosAula06.match;

import java.util.Arrays;
import java.util.List;

public class ExemploMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nomes = Arrays.asList("Gabriel", "Pessoa1", "Pessoa2");
		boolean noneMatch = nomes.stream()
				.noneMatch ( nome -> "Reginaldo".equals(nome));
		System.out.println(noneMatch);
		boolean anyMatch = nomes.stream()
				.anyMatch( nome -> "Gabriel".equals(nome));
		System.out.println(anyMatch);
		boolean allMatch = nomes.stream()
				.allMatch( nome -> "Gabriel".equals(nome));
		System.out.println(allMatch);
	}

}
