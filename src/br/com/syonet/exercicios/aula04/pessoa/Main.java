package br.com.syonet.exercicios.aula04.pessoa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa teste1 = new Pessoa("Gabriel", 859345200000L, 160);
		System.out.println(teste1.apresentaDados());
		System.out.println(teste1.calculaIdade());	
	}

}
