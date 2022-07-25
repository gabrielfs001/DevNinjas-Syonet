package br.com.syonet.aula.poo;

import java.util.Date;

public class MainPOO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa = new Pessoa("Gabriel", new Date());
		System.out.println(pessoa.getNome());
		pessoa.setNome("Fernandes");
		System.out.println(pessoa.getNome());
		
		Carro carro = new Carro();
		carro.setModelo("Gol");
		carro.setMarca("VW");
		carro.setAnoModelo(2022);
		carro.setTipo("Carro");
		carro.setAnoFabricacao(2021);
		System.out.println(carro.anda());
		
		pessoa.setCarro(carro);
		System.out.println(pessoa.getCarro().getModelo());
		
		
		Caminhao caminhao = new Caminhao();
		caminhao.setEixos(3);
		caminhao.setModelo("Truck");
		System.out.println(caminhao.anda());
		
	}

}
