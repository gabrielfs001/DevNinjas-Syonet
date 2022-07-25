package br.com.syonet.aula.poo;

public class Carro extends Veiculo{
	private String marca;
	private String modelo;
	private Integer anoModelo;
	
	public Integer getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getMarca ( ) {
		return marca;
	}
	
	public void setMarca (String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo (String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public String anda() {
		return "Carro andando";
	}
}
