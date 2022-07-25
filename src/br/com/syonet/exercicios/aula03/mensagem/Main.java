package br.com.syonet.exercicios.aula03.mensagem;

public class Main {

	/*
	 * 2) Mensagens: implemente o envio de mensagens por SMS e e-mail 
	 * onde ambas receberão um contato que possui nome, telefone e e-mail, 
	 * a mensagem que deve ser enviada e o 
	 * remetente que possui nome, 
	 * e-mail e telefone;
	 * Esse envio seria a formatação das informações conforme o padrão a seguir: 
SMS:
Nome do remetente: mensagem + telefone destinatario

E-mail:
Email destinatario - nome do destinatario:
Email remetente - nome remetente:
Mensagem
	 */
	/*
	 * - Tipos: envio por SMS e envio por e-mail;
	 * - Contato: atributos: nome, email e telefone;
	 * - 
	 */
	public static void main(String[] args) {
		Contato remetente = new Contato("Betina", "betina@gmail.com", "(51) 99251486");
		Contato destinatario = new Contato("Renan", "renan@syonet.com", "(51) 999888777");
		
		Mensageria mensageria = new Mensageria();
		String envioPorSMS = mensageria.enviaMensagem(destinatario, remetente, 
				"Olá, bem vindo ao curso dev", TipoEnvioEnum.SMS);
		System.out.println(envioPorSMS);
		String envioPorEmail = mensageria.enviaMensagem(destinatario, remetente, 
				"Olá, hoje estudaremos o javinha ", TipoEnvioEnum.EMAIL );
		System.out.println(envioPorEmail);
		String envioInvalido = mensageria.enviaMensagem(destinatario, remetente, 
				"", TipoEnvioEnum.valueOf( "EMAIL") );
		System.out.println(envioInvalido);
	}

}
