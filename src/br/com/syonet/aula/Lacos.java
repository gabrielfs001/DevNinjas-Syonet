package br.com.syonet.aula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Lacos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	String [] nomes;
	int [] numeros = {1,2,3,4,5,6};
	
	//Listas
	List<String> nomesLista = Arrays.asList("gabriel", "teste", "teste2");
	ArrayList<String> nome;
	LinkedList<String> nomesLinked;
	//..
	
	//Arrays iniciam na posição 0;
	//
	{
	for (int i = 0; i < numeros.length; i++) {
		int objeto = numeros[i];
		String objeto2 = objeto + ";";
		System.out.println(numeros[i]);
	}
	
	
	int indice = 0;
	
	while (indice < nomesLista.size( ) ) {
		//
		indice++;
	}}}
	
	/*boolean valida = true;
	do {
		System.out.println("Passando aqui");
		//
		if ("gabriel teste".equalsIgnoreCase("GABRIEL")) {
				valida=false;
		}}}}
	*/
	
	
