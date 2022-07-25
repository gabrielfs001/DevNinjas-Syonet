package br.com.syonet.exercicios.aula01;

public class Extrato {

	/*
	 * 1 ) Extrato: Na empresa em que trabalhamos, há tabelas com o gasto de 
	 * cada mês. Para fechar o balanço do primeiro trimestre, precisamos somar 
	 * o gasto total. Sabendo que, em janeiro, foram gastos 15 mil reais, em 
	 * fevereiro, 23 mil reais e, em março, 17 mil reais, faça uma classe que 
	 * calcule e imprima a despesa total no trimestre e a média mensal de gastos.
	 */
	public static void main(String[] args) {
		int gastos[] = {15000, 23000, 17000};
		int total = 0;
		
		for ( int gasto : gastos ) {
			total += gasto;
		}
		
		/*for (int indice = 0; indice <= gastos.length; indice++) {
			total += gastos[indice];
		}*/
		int media = total / gastos.length;
		System.out.println("Total " + total);
		System.out.println("Media " + media);
	}
}
