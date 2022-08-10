package br.com.syonet.exercicios.aula05.exercicio5;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio5 {

	public static void main(String[] args) {
		// Implemente um método que recebe uma lista de pessoas, que possuem nome, sobrenome, data de nascimento e cidade/estado e receba um estado. 
		// Retorne somente as cidades que são do estado correspondente.
		List < Pessoa > pessoas = Arrays.asList(new Pessoa("Gabriel", "Fernandes", LocalDate.of(1997, 03, 26), "RS", "Montenegro"),
		new Pessoa ( "Pessoa1", "Sobrenome1", LocalDate.of(1997, 01, 11), "RS", "São Leopoldo" ),
		new Pessoa ( "Pessoa2", "Sobrenome2", LocalDate.of(1998, 02, 12), "RS", "São Gabriel" ),
		new Pessoa ( "Pessoa3", "Sobrenome3", LocalDate.of(1999, 03, 13), "SC", "Florianópolis" ),
		new Pessoa ( "Pessoa4", "Sobrenome4", LocalDate.of(2000, 04, 14), "PR", "Curitiba" ));
		List <String> listaCidades = retornaCidadesEstadoCorreto(pessoas, "RS");
		listaCidades.stream().forEach(System.out::println);
	}
	
	private static List <String> retornaCidadesEstadoCorreto( List <Pessoa> pessoas, String uf ) {
		return pessoas.stream()
			.filter( pessoa -> pessoa.getUf().equals(uf) )
			.map( pessoa -> pessoa.getCidade())
			.distinct()
			.collect(Collectors.toList());
	}
}
