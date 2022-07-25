package br.com.syonet.exercicios.aula03.mensagem;

public class TipoEnvioSMS {
	
	private Contato destinatario;
	private Contato remetente;
	
	public TipoEnvioSMS( Contato destinatario, Contato remetente ) {
		this.destinatario = destinatario;
		this.remetente = remetente;
	}
	
	public String enviaMensagem( String mensagem ) {
		if ( mensagem != null && !"".equals(mensagem) ) {
			return this.remetente.getNome() + ": "
					+ mensagem + " " + this.destinatario.getTelefone();
		}
		return "";
	}

	public Contato getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Contato destinatario) {
		this.destinatario = destinatario;
	}

	public Contato getRemetente() {
		return remetente;
	}

	public void setRemetente(Contato remetente) {
		this.remetente = remetente;
	}
}
