package br.com.syonet.exercicios.aula03.mensagem;

public class TipoEnvioEmail {
	private Contato destinatario;
	private Contato remetente;
	
	public TipoEnvioEmail( Contato destinatario, Contato remetente ) {
		this.destinatario = destinatario;
		this.remetente = remetente;
	}
	
	public String envioMensagem(String mensagem) {
		if ( mensagem == null || "".equals(mensagem)) {
			return "";
		}
		if ( this.destinatario == null ) {
			return "";
		}
		if ( this.remetente == null ) {
			return "";
		}
		return this.destinatario.getEmail() + " - " + this.destinatario.getNome()
			+ "\n" + this.remetente.getEmail() + " - " + this.remetente.getNome()
			+ "\n" + mensagem;
	}
}
