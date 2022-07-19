package br.com.syonet.exercicios1poo;

public class Apartamento extends Imovel{
	private Integer comodos;
	private boolean salaoDeFestas;
	
	public Apartamento(float valorImovel, float areaImovel, Integer comodos, boolean salaoDeFestas) {
		super(valorImovel, areaImovel);
		this.comodos = comodos;
		this.salaoDeFestas = salaoDeFestas;
	}
	
	public Integer getComodos() {
		return comodos;
	}
	public void setComodos(Integer comodos) {
		this.comodos = comodos;
	}
	public boolean getSalaoDeFestas() {
		return salaoDeFestas;
	}
	public void setSalaoDeFestas(boolean salaoDeFestas) {
		this.salaoDeFestas = salaoDeFestas;
	}
	public String getDescricaoSalao() {
		if (this.salaoDeFestas){
			return " - Possui Salão de Festas";
		}else {
			return " - Não possui Salão de Festas";
		}
	}
	public String exibeInfo() {
		return super.exibeInfo() 
				+ " - Número de cômodos: " 
				+ this.comodos 
				+ this.getDescricaoSalao();
	}
}
