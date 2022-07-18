package br.com.syonet;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int gastoJaneiro = 15000;
		int gastoFevereiro = 23000;
		int gastoMarco = 17000;
		int gastoTrimestre = (gastoJaneiro + gastoFevereiro + gastoMarco);
		int mediaGastoTrimestre = (gastoTrimestre /3);
		System.out.println("O gasto total do Trimestre é " + gastoTrimestre + " e a média de gasto mensal é " + mediaGastoTrimestre);
	}

}

/*
 * -- Correção --
 * int gastos[] = {15000, 23000, 17000};
 * int total = 0;
 * for ( int gasto : gastos ) {
 * 		total += gasto;
 * }
 * int medio = total / gastos.length;
 * System.out.println("Total " + total);
 * System.out.println("Media " +media);
 */