package br.com.syonet.aula.interfaceExemplo;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnvioMensagem enviaMensagem = new EnvioSMS();
		String retorno = enviaMensagem.envio("Olá Colegas", "999888777", "Gabriel");
		System.out.println(retorno);
		enviaMensagem = new EnvioEmail();
		retorno = enviaMensagem.envio("teste email", "DSV", "Gabriel");
		System.out.println(retorno);
		// Herança:  É UM
		//Composição : POSSUI UM
		//Interface: FAZ UM // CONTRATO
		List<EnvioMensagem> lista = Arrays.asList(new EnvioSMS(), new EnvioEmail(), new EnvioWhatsapp());
		
		for (EnvioMensagem envioMensagem : lista) {
			envioMensagem.envio("teste", "dsv", "gabriel");
		}
	}

}
