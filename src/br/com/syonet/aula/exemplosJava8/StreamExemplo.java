package br.com.syonet.aula.exemplosJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExemplo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nomes = Arrays.asList("Betina", "Renan", "Jonathan", "Julian", "Louise", "Gabriel", "Helio", "Matheus", "Tiago", "Augusto");
		
		for (int i=0; i < args.length; i++) {
			
		}
		
		//Utilizando for
		/*
		List <String> nomesModificados = new ArrayList<>();
		for (String nome : nomes) {
			if ( nome != null && nome != "") {
				nome = nome.toUpperCase();
				nome = nome + " " + "Sobrenome";
				nomesModificados.add(nome);
			}
			if (nome.equals("lala")) {
				System.out.println(nome);
				break;
			}
		}
		*/
		//Utilizando .Stream
		
		List <String> nomesModificados2 = nomes.stream()
			.filter( nome -> nome != null && nome != "")
			.map( nome -> nome.toUpperCase())
			.map( nome -> {
				return nome + " " + "Sobrenome";
			})
			.collect(Collectors.toList());
		
		nomesModificados2.forEach(System.out::println);
		System.out.println("----------------");
		
		nomesModificados2.stream()
			.filter(nome -> nome != null)
			.forEach( nome -> System.out.println(nome));
		
		String nomeEncontrado = nomesModificados2.stream()
				.filter( nome -> "Gabriel".equals(nome))
				.findFirst()
				.map( nome -> {
					return nome.toLowerCase();
				})
				.orElse("Não encontrado");
		
		System.out.println("--------------");
		
		List <Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8);
		numeros.stream()
			.filter(numero -> numero % 2 != 0)
			.map( numero -> {
				System.out.println("numero da vez" + numero);
				return numero + 1.5;
			})
			.collect(Collectors.toList())
			.forEach( numero -> System.out.println(numero));;

	}
}
