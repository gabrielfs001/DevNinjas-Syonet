package br.com.syonet.aula.poo;

public class Caminhao extends Veiculo{
	private String marca;
	private String modelo;
	private Integer anoModelo;
	private Integer eixos;

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
	public Integer getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}
	public Integer getEixos() {
		return eixos;
	}
	public void setEixos(Integer eixos) {
		this.eixos = eixos;
	}
	
}
