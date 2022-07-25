package br.com.syonet.exercicios.aula03.imobiliaria;

public class Casa extends Imovel {

	private Integer numeroComodos;
	private Integer areaTerreno;
	
	public Casa(Float valorVenda, Integer areaImovel, 
			Integer numeroComodos, Integer areaTerreno) {
		super(valorVenda, areaImovel);
		this.numeroComodos = numeroComodos;
		this.areaTerreno = areaTerreno;
	}

	public Integer getNumeroComodos() {
		return numeroComodos;
	}

	public void setNumeroComodos(Integer numeroComodos) {
		this.numeroComodos = numeroComodos;
	}

	public Integer getAreaTerreno() {
		return areaTerreno;
	}

	public void setAreaTerreno(Integer areaTerreno) {
		this.areaTerreno = areaTerreno;
	}
	
	@Override
	public Float getValorVenda() {
		return super.getValorVenda() * 1.5f;
	}
	
	@Override
	public String toString() {
		return "Casa: \n" 
			+ super.toString()
			+ "\nComodos: " + this.getNumeroComodos()
			+ "\nArea do Terreno: " + this.getAreaTerreno();
	}
}
