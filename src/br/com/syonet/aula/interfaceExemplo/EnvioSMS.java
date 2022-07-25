package br.com.syonet.aula.interfaceExemplo;

public class EnvioSMS implements EnvioMensagem{

	@Override
	public String envio(String mensagem, String destinatario, String remetente) {
		// TODO Auto-generated method stub
		return "Remetente: " + remetente
				+ " - Destinatario: " + destinatario
				+ " - Mensagem: " + mensagem;
		
		
	}
	
}
