package br.com.syonet.aula;

public class Aula0706 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TIPOS PRIMITIVOS
		// Tipo: numéricos, lógicos e caracteres
		//Numéricos: Inteiro e reais
		int idade = 10;
		long dtNascimento = 12344321;
		float preco = 15.50f;
		double restoDivisao = 14.5040;
		
		//Lógico
		boolean ehNumeroImpar = true; //or false
		
		//caracteres
		char sexo = 'M';
		
		//TIPOS PRIMITIVOS
		//caracteres
		String nome = "Gabriel";
		boolean igual = nome.equals("Fernandes");
		
		//Operadores
		//Relacionais, Aritméticos, lógicos
		System.out.println(idade == dtNascimento);
		System.out.println(idade != dtNascimento);
		System.out.println(preco >= restoDivisao);
		System.out.println(preco <= restoDivisao);
		
		//Lógicos
		// && (e) || (ou) ! (negação)
		System.out.println('M' == sexo || nome == "Gabriel");
		System.out.println(!ehNumeroImpar);
		
		//Aritméticos
		//idade = idade +1
		idade = idade++;
		idade +=1;
		//idade = idade -1
		idade = idade--;
		idade -=1;
		
		nome += "Fernandes";
		System.out.println(nome);
		
	}

}
