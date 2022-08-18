package br.com.syonet.exercicios.aula07.exercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Conta> contas = Arrays.asList(new Conta("03696184080", "Gabriel", "Banco Syonet", 1234, 123123123, 15000.51d),
		new Conta("12345678901", "Conta 1", "Banco Contas", 4321, 321321321, 156456.00d),
		new Conta("12345678902", "Conta 2", "Banco Syonet", 1223, 123456789, -220000.00d));
		try {
			buscaContaPorCpf(contas, "03696184080").forEach(System.out::println);
		} catch (ContaNaoEncontradaException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("Saldo: "+ retornaSaldo(contas, "03696184080") + "\n ------------------");
		} catch (SaldoNegativadoException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("Saldo: "+ saqueConta(contas, "Banco Syonet", 1234, 123123123, 2000d)+"\n ------------------");
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}};
		
		
	private static List<Conta> buscaContaPorCpf(List<Conta> contas,String cpf) throws ContaNaoEncontradaException {
		List<Conta> contasFiltradas = contas.stream()
				.filter(conta -> conta.getCpf().equals(cpf))
				.collect(Collectors.toList());
		if (contasFiltradas.isEmpty()) {
			throw new ContaNaoEncontradaException("Conta não encontrada.");
		}else {
			return contasFiltradas;
		}
	}
	
	private static Double retornaSaldo(List<Conta> contas,String cpf) throws SaldoNegativadoException {
		List<Conta> contasFiltradas = contas.stream()
		.filter(conta -> conta.getCpf().equals(cpf))
		.collect(Collectors.toList());
		if (contasFiltradas.get(0).getSaldo() < 0) {
			throw new SaldoNegativadoException("Saldo negativo!");
		}else {
			return contasFiltradas.get(0).getSaldo();
		}
	}
	
	private static Double saqueConta(List<Conta> contas, String banco, Integer agencia, Integer numeroConta, Double valorSaque) throws SaldoInsuficienteException{
		List<Conta> contasFiltradas = contas.stream()
		.filter(conta -> conta.getBanco().equals(banco))
		.filter(conta -> conta.getAgencia().equals(agencia))
		.filter(conta -> conta.getNumeroConta().equals(numeroConta))
		.collect(Collectors.toList());
		if ((contasFiltradas.get(0).getSaldo() - valorSaque) < 0) {
			throw new SaldoInsuficienteException("Saldo insuficiente para saque!");
		}else {
			contasFiltradas.get(0).setSaldo(contasFiltradas.get(0).getSaldo() - valorSaque);
			return contasFiltradas.get(0).getSaldo();
		}
		
	}
}
