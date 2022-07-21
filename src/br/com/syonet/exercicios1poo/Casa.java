package br.com.syonet.exercicios1poo;

public class Casa extends Imovel{
	private Integer comodos;
	private float areaTerreno;
	
	public Casa (float valorImovel, float areaImovel, Integer comodos, float areaTerreno) {
		super(valorImovel, areaImovel);
		this.comodos = comodos;
		this.areaTerreno = areaTerreno;
	}
	
	public Integer getComodos() {
		return comodos;
	}
	public void setComodos(Integer comodos) {
		this.comodos = comodos;
	}
	public float getAreaTerreno() {
		return areaTerreno;
	}
	public void setAreaTerreno(float areaTerreno) {
		this.areaTerreno = areaTerreno;
	}
	public String exibeInfo() {
		return super.exibeInfo() 
				+ " - Número de cômodos: " 
				+ this.comodos 
				+ " - Área do Terreno: " 
				+ this.areaTerreno 
				+ "m²";
	}
		
}
