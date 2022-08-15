package br.com.syonet.exercicios.aula07.exercicio1;

public class Conta {
	private String cpf;
	private String nome;
	private String banco;
	private Integer agencia;
	private Integer numeroConta;
	private Double saldo;

	public Conta() {
	}
	
	public Conta(String cpf, String nome, String banco, Integer agencia, Integer numeroConta, Double saldo) {
		this.cpf = cpf;
		this.nome = nome;
		this.banco = banco;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public Integer getAgencia() {
		return agencia;
	}
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}
	public Integer getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Dados da conta: \nCPF: " + cpf +
				".\nNome: " + nome +
				".\nBanco: " + banco +
				".\nAgência: " + agencia +
				".\nNúmero da conta: " + numeroConta +
				".\nSaldo: R$" + saldo +
				"\n -----------------------------";
	}
}
