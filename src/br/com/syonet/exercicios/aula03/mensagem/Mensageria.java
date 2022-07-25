package br.com.syonet.exercicios.aula03.mensagem;

public class Mensageria {
	
	public String enviaMensagem( Contato destinatario, Contato remetente, 
			String mensagem, TipoEnvioEnum tipoEnvio ) {
		
		String mensagemFormatada = "";
		switch (tipoEnvio) {
		case EMAIL:
			mensagemFormatada = new TipoEnvioEmail(destinatario, remetente)
					.envioMensagem(mensagem);
			break;
		case SMS:
			mensagemFormatada = new TipoEnvioSMS(destinatario, remetente)
					.enviaMensagem(mensagem);
			break;
		default:
			mensagemFormatada = "Tipo de envio INVÁLIDO";
			break;
		}
		return mensagemFormatada;
	}
}
