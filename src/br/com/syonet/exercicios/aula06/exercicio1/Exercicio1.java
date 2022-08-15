package br.com.syonet.exercicios.aula06.exercicio1;

import java.util.Arrays;
import java.util.List;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Veiculo> veiculos = Arrays.asList(new Veiculo("HONDA", "CIVIC", "HCB1212", "A1B2C3D4", 50000),
				new Veiculo("TOYOTA", "COROLLA", "TCB3232", "A2B3C4D5", 60000),
				new Veiculo("NISSAN", "KICKS", "NKB1234", "A3B4C5D6", 40000)
				);
		
		String veiculosFiltradosPorVW = verificaSeTodosSaoVW(veiculos);
		System.out.println(veiculosFiltradosPorVW);
		String veiculosFiltradosPorModeloGol = verificaSeNenhumEGol(veiculos);
		System.out.println(veiculosFiltradosPorModeloGol);
		String veiculosFiltradosPorModeloJetta = verificaSeAlgumEJetta(veiculos);
		System.out.println(veiculosFiltradosPorModeloJetta);
		

	}
	
	private static String verificaSeTodosSaoVW( List <Veiculo> veiculos ) {
		boolean allMatch = veiculos.stream()
				.allMatch ( veiculo -> "VW".equals(veiculo.getMarca()));
			if (allMatch) {
				return "Todos os veículos são VW";
			}else{
				return "Não são todos os veículos que são VW";
			}
		}

	private static String verificaSeNenhumEGol( List <Veiculo> veiculos ) {
		boolean noneMatch = veiculos.stream()
				.noneMatch ( veiculo -> "GOL".equals(veiculo.getModelo()));
			if (noneMatch) {
				return "Nenhum veículo é do modelo GOL";
			}else{
				return "Algum veículo é do modelo GOL";
			}
		}
	
	private static String verificaSeAlgumEJetta( List <Veiculo> veiculos ) {
		boolean anyMatch = veiculos.stream()
				.anyMatch ( veiculo -> "JETTA".equals(veiculo.getModelo()));
			if (anyMatch) {
				return "Algum veículo é do modelo JETTA";
			}else{
				return "Nenhum veículo é do modelo JETTA";
			}
		}
	}

