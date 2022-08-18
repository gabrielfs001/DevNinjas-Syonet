package br.com.syonet.exercicios.aula08.exercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import br.com.syonet.exercicios.aula07.exercicio1.ContaNaoEncontradaException;
import br.com.syonet.exercicios.aula07.exercicio1.SaldoInsuficienteException;

public class GerenciadorContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Titular titular1 = new Titular("03696184080", "Gabriel TESTE");
		Titular titular2 = new Titular("14253678910", "Titular2 TESTE");
		Titular titular3 = new Titular("41526398701", "Titular3 TESTE");
		List<Conta> listaDeContas = Arrays.asList(new Conta("Banco Syonet", 1223, 1234, 987654321, 50000d, TipoDeContaEnum.CONTACORRENTE, titular1),
			new Conta("Banco do Brasil", 3221, 4321, 987987987, 100000d, TipoDeContaEnum.CONTAPOUPANCA, titular1),
			new Conta("Banco do Brasil", 3221, 4321, 987987986, 150000d, TipoDeContaEnum.CONTACORRENTE, titular1),
			new Conta("Banco do Brasil", 3221, 4321, 456654456, 30000d, TipoDeContaEnum.CONTACORRENTE, titular2),
			new Conta("Banco do Brasil", 3221, 4321, 123321123, 1500d, TipoDeContaEnum.CONTASALARIO, titular3));
		
		try {
			contasPorCpf(listaDeContas, "03696184080").forEach(System.out::println);
		} catch (ContaNaoEncontradaException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(consultaContaOptional(listaDeContas, "Banco do Brasil", 4321, 987987987));
		} catch (ContaNaoEncontradaException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(saqueContaOptional(listaDeContas, "Banco do Brasil", 4321, 987987987, 10000d));
		} catch (ContaNaoEncontradaException e) {
			e.printStackTrace();
		}
	}

	private static List<Conta> contasPorCpf(List<Conta> listaDeContas, String cpf) throws ContaNaoEncontradaException {
		List<Conta> contasFiltradas = listaDeContas.stream()
				.filter(conta -> conta.getTitular().getCpf().equals(cpf))
				.collect(Collectors.toList());
		if (contasFiltradas.isEmpty()) {
			throw new ContaNaoEncontradaException("Conta não encontrada.");
		}else {
			return contasFiltradas;
		}
	}
	
	private static Optional<Conta> consultaContaOptional(List<Conta> listaDeContas, String banco, Integer agencia, Integer numeroConta) throws ContaNaoEncontradaException {
		Optional<Conta> contaFiltrada = Optional.ofNullable(listaDeContas.stream()
				.filter(conta -> conta.getBanco().equals(banco))
				.filter(conta -> conta.getAgencia().equals(agencia))
				.filter(conta -> conta.getNumeroConta().equals(numeroConta))
				.findFirst().orElseThrow( () -> new ContaNaoEncontradaException("Conta não encontrada.")));
		return contaFiltrada;
	}
	
	private static Optional<Conta> saqueContaOptional(List<Conta> listaDeContas, String banco, Integer agencia, Integer numeroConta, Double valorSaque) throws SaldoInsuficienteException {
		Optional<Conta> contaFiltrada = consultaContaOptional(listaDeContas, banco, agencia, numeroConta);
		if (contaFiltrada.get().getSaldo() < valorSaque) {
			throw new SaldoInsuficienteException("Saldo insuficiente para saque!");
		}else {
			contaFiltrada.get().setSaldo(contaFiltrada.get().getSaldo() - valorSaque);
			return contaFiltrada;
		}
	}
	
	
}