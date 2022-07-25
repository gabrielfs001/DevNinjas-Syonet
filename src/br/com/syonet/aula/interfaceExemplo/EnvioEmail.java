package br.com.syonet.aula.interfaceExemplo;

public class EnvioEmail implements EnvioMensagem, RecebimentoResposta {
	
	@Override
	public String envio(String mensagem, String destinatario, String remetente) {
		// TODO Auto-generated method stub
		return "Email Destinatario: " + destinatario
				+ " -  Remetente:" + remetente
				+ " - Mensagem: " + mensagem;
		
	}
	
	@Override
	public void resposta() {
		
	}
}
