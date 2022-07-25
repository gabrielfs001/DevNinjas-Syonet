package br.com.syonet.aula.interfaceExemplo;

public class EnvioWhatsapp implements EnvioMensagem{

	@Override
	public String envio(String mensagem, String destinatario, String remetente) {
		// TODO Auto-generated method stub
		return "Whatsapp Destinatario: " + destinatario
				+ " -  Remetente:" + remetente
				+ " - Mensagem: " + mensagem;
	}
	
	
}
