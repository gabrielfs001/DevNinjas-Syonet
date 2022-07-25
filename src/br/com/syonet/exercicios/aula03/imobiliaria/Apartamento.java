package br.com.syonet.exercicios.aula03.imobiliaria;

public class Apartamento extends Imovel {

	private Boolean possuiSalaoFestas;
	private Integer numeroComodos;
	
	public Apartamento(Float valorVenda, Integer areaImovel,
			Boolean possuiSalaoFestas, Integer numeroComodos ) {
		super(valorVenda, areaImovel);
		this.possuiSalaoFestas = possuiSalaoFestas;
		this.numeroComodos = numeroComodos;
	}
	
	public Boolean getPossuiSalaoFestas() {
		return possuiSalaoFestas;
	}
	public void setPossuiSalaoFestas(Boolean possuiSalaoFestas) {
		this.possuiSalaoFestas = possuiSalaoFestas;
	}
	public Integer getNumeroComodos() {
		return numeroComodos;
	}
	public void setNumeroComodos(Integer numeroComodos) {
		this.numeroComodos = numeroComodos;
	}
	
	@Override
	public String toString() {
		String salaoDeFestas = this.getPossuiSalaoFestas() ? "sim" : "nao";
		return "Apartamento: \n" 
			+ super.toString()
			+ "\nComodos: " + this.getNumeroComodos()
			+ "\nSalão de Festas: " + salaoDeFestas;
	}
}
