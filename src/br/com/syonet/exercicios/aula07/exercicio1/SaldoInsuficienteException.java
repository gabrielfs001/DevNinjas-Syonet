package br.com.syonet.exercicios.aula07.exercicio1;

public class SaldoInsuficienteException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SaldoInsuficienteException(String message) {
		super(message);
	}
}
