package br.com.syonet.exercicios.aula04.concessionaria;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
	private String nome;
	private List<Veiculo> veiculos = new ArrayList<>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Veiculo> getVeiculos() {
		return veiculos;
	}
	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
	
	public Concessionaria(String nome) {
		this.nome = nome;
	}
	
	public String adicionaVeiculo(int qtdRodas, int peso, String cor, int ano, String marca, String modelo, String tipoVeiculo, float valorVenda) {
		veiculos.add(new Veiculo(qtdRodas, peso, cor, ano, marca, modelo, tipoVeiculo, valorVenda));
		return "Veículo adicionado com sucesso!";
	}
	public String adicionaCarro(int qtdRodas, int peso, String cor, int ano, String marca, String modelo, String tipoVeiculo, float valorVenda) {
		veiculos.add(new Carro(qtdRodas, peso, cor, ano, marca, modelo, tipoVeiculo, valorVenda));
		return "Veículo adicionado com sucesso!";
	}
	public String adicionaMoto(int qtdRodas, int peso, String cor, int ano, String marca, String modelo, String tipoVeiculo, float valorVenda, int cilindrada) {
		veiculos.add(new Moto(qtdRodas, peso, cor, ano, marca, modelo, tipoVeiculo, valorVenda, cilindrada));
		return "Veículo adicionado com sucesso!";
	}
	public String adicionaCaminhao(int qtdRodas, int peso, String cor, int ano, String marca, String modelo, String tipoVeiculo, float valorVenda, String tipoCarroceria) {
		veiculos.add(new Caminhao(qtdRodas, peso, cor, ano, marca, modelo, tipoVeiculo, valorVenda, tipoCarroceria));
		return "Veículo adicionado com sucesso!";
	}
	
	public String listaVeiculos() {
		String retorno = "";
		for (Veiculo veiculos : this.getVeiculos()) {
			retorno += veiculos + "\n";
		}
		return retorno;
	}
	
	public String listaCarros(String tipo) {
		String retorno = "";
		for (Veiculo veiculos : this.getVeiculos()) {
			if ((veiculos instanceof Carro) && (tipo.equals(veiculos.getTipoVeiculo()))) {
			retorno += veiculos + "\n";
		}else if ((veiculos instanceof Carro) && (tipo.equals("Ambos"))) {
			retorno += veiculos + "\n";
		}
	}
		return retorno;
	}
	
	public String listaMotos(String marca, int cilindrada) {
		String retorno = "";
		for (Veiculo veiculos : this.getVeiculos()) {
			if ((veiculos instanceof Moto) && (marca.equals(veiculos.getMarca()) && (cilindrada == (((Moto) veiculos).getCilindrada())))) {
			retorno += veiculos + "\n";
		}
	}
		return retorno;
	}
	//Também daria pra utilizar switch fazendo validação pros tipos específicos.
	public String listaCaminhao(String tipoCarroceria) {
		String retorno = "";
		for (Veiculo veiculos : this.getVeiculos()) {
			if ((veiculos instanceof Caminhao) && (tipoCarroceria.equals(((Caminhao)veiculos).getTipoCarroceria()))) {
		retorno += veiculos + "\n";
		}
	}
		return retorno;
	}
	
	public String atualizaPreco(String marca, String modelo, float novoValor) {
		String retorno = "";
		for (Veiculo veiculos : this.getVeiculos()) {
			if ((marca.equals(veiculos.getMarca()) && (modelo.equals(veiculos.getModelo())))){
				veiculos.setValorVenda(novoValor);
				retorno = "Preço atualizado com sucesso!";
			}
		}
		return retorno;
	}
	
	public String vendeVeiculo(String tipoCliente, String marca, String modelo) {
		String retorno ="";
		float valorNegociacao = 0;
		for (Veiculo veiculos : this.getVeiculos()) {
			if ((marca.equals(veiculos.getMarca()) && (modelo.equals(veiculos.getModelo())))) {
				valorNegociacao = veiculos.getValorVenda();
				}
			}
		switch(tipoCliente) {
		case "PNE":
			valorNegociacao = (valorNegociacao * 0.5f);
			retorno = "Valor de venda: " + valorNegociacao;
			break;
		case "Agricultor":
			valorNegociacao = (valorNegociacao * 0.6f);
			retorno = "Valor de venda: " + valorNegociacao;
		default:
			retorno = "Valor de venda: " + valorNegociacao;
			break;
		}
		return retorno;
	}
}
		
		

			

	
