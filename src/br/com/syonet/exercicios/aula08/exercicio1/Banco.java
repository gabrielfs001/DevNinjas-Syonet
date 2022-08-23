package br.com.syonet.exercicios.aula08.exercicio1;

public class Banco {
	private String banco;
	private Integer codigo;
	
	public Banco(String banco, Integer codigo) {
		this.banco = banco;
		this.codigo = codigo;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
}
