package br.com.syonet.exercicios.aula07.exercicio1;

public class SaldoNegativadoException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public SaldoNegativadoException(String message) {
		super(message);
	}
}
