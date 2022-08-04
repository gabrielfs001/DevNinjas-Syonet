package br.com.syonet.exercicios.aula5.exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio3 {

	public static void main(String[] args) {
		// Implemente um método que recebe uma lista de pessoas, que possuem nome sobrenome, data de nascimento e cidade, retorne as pessoas maiores de 18 anos.
		Pessoa pessoa1 = new Pessoa("Gabriel", "Fernandes", "Montenegro", 859345200000L);
		Pessoa pessoa2 = new Pessoa("TesteMenor", "Aluno", "Montenegro", 1174878000000L);
		Pessoa pessoa3 = new Pessoa("TesteMaior", "Aluno", "Montenegro", 543726000000L);
		List <Pessoa> pessoas = new ArrayList <Pessoa> ();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
	
		List<Pessoa> nomesFiltrados = pessoas.stream()
				.filter (pessoa -> pessoa.calculaIdade() >= 18)
				.collect(Collectors.toList());
			
			nomesFiltrados.forEach(System.out::println);
			System.out.println("----------------");
		}
	}

