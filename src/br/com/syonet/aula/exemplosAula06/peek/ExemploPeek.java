package br.com.syonet.aula.exemplosAula06.peek;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploPeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Pessoa> pessoas = Arrays.asList(new Pessoa ("Gabriel"),new Pessoa("Pessoa2"), new Pessoa ("Pessoa1"));
		pessoas.stream()
			.peek( pessoa -> pessoa.setSobrenome("Silva"))
			.collect(Collectors.toList());
		pessoas.stream().forEach(System.out::println);
		System.out.println("-------------");
		
		Comparator<Pessoa> comparator = Comparator.comparing( Pessoa::getNome);
		List <Pessoa> listaOrdenada = pessoas.stream()
				.sorted(comparator)
				.collect(Collectors.toList());
		listaOrdenada.stream().forEach(System.out::println);
	}

//	List <Integer> numeros = Arrays.asList( 1,2,3,4,5,6,7,7,7,8,8,8);
//	Integer somaTotal = numeros.stream()
//		.peek( numero -> System.out.println(numero))
//		.collect(Collectors.toList());
//	Integer numerosReduzidos = numeros.stream()
//			.reduce(0, Integer::sum);
//	System.out.println(numerosReduzidos);
}
