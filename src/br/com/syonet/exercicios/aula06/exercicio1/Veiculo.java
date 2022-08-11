package br.com.syonet.exercicios.aula06.exercicio1;

public class Veiculo {
	private String marca;
	private String modelo;
	private String placa;
	private String chassi;
	private Integer valor;
	
	public Veiculo(String marca, String modelo, String placa, String chassi, Integer valor) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.chassi = chassi;
		this.valor = valor;
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
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Veiculo (Marca= " + marca + ", modelo=" + modelo +", placa=" + placa + ", chassi" + chassi + ", valor=" + valor +")";
		}
}
