package br.com.syonet.exercicios.aula04.elevador;

public class Elevador {
	/*2) Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um prédio.
	A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o térreo), capacidade do elevador e quantas pessoas estão presentes nele.
	A classe deve também disponibilizar os seguintes métodos:
    Inicializa : que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre começam no térreo e vazio);
    Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
    Sai : para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
    Sobe : para subir um andar (não deve subir se já estiver no último andar);
    Desce : para descer um andar (não deve descer se já estiver no térreo);
    Encapsular todos os atributos da classe (criar os métodos set e get).*/

	private int andarAtual;
	private int totalAndares;
	private int capacidadeElevador;
	private int lotacaoAtual;
	
	public Elevador(int totalAndares, int capacidadeElevador) {
		this.andarAtual = 0;
		this.lotacaoAtual = 0;
		this.totalAndares = totalAndares;
		this.capacidadeElevador = capacidadeElevador;
	}
	
	public int getAndarAtual() {
		return andarAtual;
	}
	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}
	public int getTotalAndares() {
		return totalAndares;
	}
	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}
	public int getCapacidadeElevador() {
		return capacidadeElevador;
	}
	public void setCapacidadeElevador(int capacidadeElevador) {
		this.capacidadeElevador = capacidadeElevador;
	}
	public int getLotacaoAtual() {
		return lotacaoAtual;
	}
	public void setLotacaoAtual(int lotacaoAtual) {
		this.lotacaoAtual = lotacaoAtual;
	}
	
	public String Entra() {
		if (lotacaoAtual < capacidadeElevador){
			lotacaoAtual++;
			return "Uma pessoa entrou no elevador! Há " + lotacaoAtual + " pessoas no elevador neste momento";
		}else{
			return "Há " + lotacaoAtual + " pessoas no elevador! O elevador está lotado.";
		}
		 
	}
	
	public String Sai() {
		if (lotacaoAtual > 0){
			lotacaoAtual--;
			return "Uma pessoa entrou no elevador! Há " + lotacaoAtual + " pessoas no elevador neste momento";
		}else{
			return "Há " + lotacaoAtual + " pessoas no elevador! O elevador está vazio.";
		}
		 
	}
	public String Sobe() {
		if (andarAtual < totalAndares) {
			andarAtual++;
			return "Subindo um andar... O andar atual é: " + andarAtual;
		}else {
			return "Não é possível subir mais. O andar atual é: " + andarAtual;
		}
	}
	public String Desce() {
		if (andarAtual > 0) {
			andarAtual--;
			return "Descendo um andar... O andar atual é: " + andarAtual;
		}else {
			return "Não é possível descer mais. O andar atual é: " + andarAtual;
		}
	}
	
}
