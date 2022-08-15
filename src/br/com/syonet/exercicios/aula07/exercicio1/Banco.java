package br.com.syonet.exercicios.aula07.exercicio1;

import java.util.Arrays;
import java.util.List;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Conta> contas = Arrays.asList(new Conta("03696184080", "Gabriel", "Banco Syonet", 1234, 123123123, 15000.51d),
		new Conta("12345678901", "Conta 1", "Banco Contas", 4321, 321321321, 156456.00d),
		new Conta("12345678902", "Conta 2", "Banco Syonet", 1223, 123456789, -220000.00d));
		contas.forEach(System.out::println);
	}

	
}
