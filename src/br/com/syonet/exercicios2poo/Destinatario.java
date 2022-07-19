package br.com.syonet.exercicios2poo;

public class Destinatario extends Contato{
	
	public Destinatario (String nome, Integer telefone, String email) {
		super(nome, telefone, email);
	}
	
	public String infoEmailDestinatario() {
		return (getEmail() + " - " + getNome() + "\n");
	}
}
