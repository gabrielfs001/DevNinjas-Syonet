package br.com.syonet.exercicios.aula08.exercicio1;

public class Conta extends Banco{
	private Integer agencia;
	private Integer numeroConta;
	private Double saldo;
	private TipoDeContaEnum tipoConta;
	private Titular titular;
	
	public Conta(String banco, Integer codigo, Integer agencia, Integer numeroConta, Double saldo,
			TipoDeContaEnum tipoConta, Titular titular) {
		super(banco, codigo);
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.tipoConta = tipoConta;
		this.titular = titular;
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
	public TipoDeContaEnum getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(TipoDeContaEnum tipoConta) {
		this.tipoConta = tipoConta;
	}
	public Titular getTitular() {
		return titular;
	}
	public void setTitular(Titular titular) {
		this.titular = titular;
	}
	@Override
	public String toString() {
		return "Dados da conta: \nCPF: " + titular.getCpf() +
				".\nNome Titular: " + titular.getNome() +
				".\nBanco: " + super.getBanco() +
				".\nCódigo do banco: " + super.getCodigo() +
				".\nAgência: " + agencia +
				".\nNúmero da conta: " + numeroConta +
				".\nSaldo: R$" + saldo +
				".\nTipo de conta: " + tipoConta +
				"\n -----------------------------";

}}

