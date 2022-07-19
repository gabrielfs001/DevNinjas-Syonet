package br.com.syonet.exercicios2poo;

public class Remetente extends Contato {
	private String mensagem;
	
	
	public Remetente (String nome, Integer telefone, String email, String mensagem) {
		super(nome, telefone, email);
		this.mensagem = mensagem;
		
	}
	
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String infoEmailRemetente() {
		return (getEmail() + " - " + getNome() + "\n");
	}
	
}
