package br.com.syonet.exercicios.aula05.exercicio4;

public class Veiculo {
	private Integer chassi;
	private String marca;
	private String modelo;
	
	public Veiculo(Integer chassi, String marca, String modelo) {
		this.chassi = chassi;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public Integer getChassi() {
		return chassi;
	}
	public void setChassi(Integer chassi) {
		this.chassi = chassi;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String toString() {
		return "Chassi nº: " + this.chassi + " - Marca: " + this.marca +  " - Modelo: " + this.modelo + ".";
	}
}
