package br.com.syonet.exercicios2poo;

public class MainExercicio2POO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remetente remetente1 = new Remetente("Remetente1", 999998888, "remetente1@teste.com", "ESTA MENSAGEM É UM TESTE! ");
		Destinatario destinatario1 = new Destinatario("Destinatario1", 888887777, "destinatario1@teste.com");
		//Sem métodos
		System.out.println(remetente1.getNome() + ": " + remetente1.getMensagem() + destinatario1.getTelefone());
		System.out.println("--------------------------------");
		System.out.println(destinatario1.getEmail() + " - " + destinatario1.getNome() + "\n" + remetente1.getEmail() + " - " + remetente1.getNome() + "\n" + remetente1.getMensagem());
		System.out.println("--------------------------------");
		//Com métodos
		System.out.println(destinatario1.infoEmailDestinatario() + remetente1.infoEmailRemetente() + remetente1.getMensagem());
		
	}
	
		
}
