package br.com.syonet.aula.exemplosJava8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExemplo {

	public static void main(String[] args) {
		//NullPointerException
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Gabriel");
		pessoa.setSobrenome("Fernandes");
		List <Pessoa> pessoas = new ArrayList <Pessoa> ();
		pessoas.add(pessoa);
		if ( pessoa.getNome().isPresent() ) {
			System.out.println( pessoa.getNome().get().toUpperCase() );
		}
		Optional <Pessoa> pessoaEncontradaPorSobrenome = buscaPorSobrenome(pessoas,"Fernandes");
		System.out.println(pessoaEncontradaPorSobrenome.get().getNome().get());
		
		
		pessoaEncontradaPorSobrenome.ifPresent( pessoaEncontrada -> {
			System.out.println(pessoaEncontrada.getNome());
		});
		
		//Java11
		pessoaEncontradaPorSobrenome.ifPresentOrElse( pessoaEncontrada -> {
			System.out.println("Pessoa Encontrada.");
		}, () -> {
			System.out.println("Pessoa NÂO foi encontrada.");
		});
		//.map
		String pessoaNome =
				pessoaEncontradaPorSobrenome.map( p -> p.getNome().get() )
				.orElse("teste");
		
		String pessoaNome2 =
				pessoaEncontradaPorSobrenome.map( p -> p.getNome().get() )
				.orElseThrow( () -> new IllegalArgumentException() );
		
	}
	public static Optional <Pessoa> buscaPorSobrenome (List <Pessoa> pessoas, String sobrenome) {
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getSobrenome().isPresent()) {
				if ( pessoa.getSobrenome().get().equals(sobrenome)) {
					return Optional.ofNullable(pessoa);
					}
				}
			}
		return Optional.empty();
	}
}


