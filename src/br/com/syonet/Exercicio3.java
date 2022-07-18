package br.com.syonet;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palavra = "teste impressao";
		String palavraImpressao = "";
		
		for (int i = 0; i < palavra.length(); i++) {
			if (palavra.charAt(i) == ('a')) {
			}else if(palavra.charAt(i) == ('e')){
			}else if(palavra.charAt(i) == ('i')){
			}else if(palavra.charAt(i) == ('o')){
			}else if(palavra.charAt(i) == ('u')){
			}else {
				palavraImpressao = palavraImpressao + palavra.charAt(i);
			}
		}
		System.out.println(palavraImpressao);
	}

}
//String nome = "Teste";
//System.out.println(nome.replaceAll("[aeiouAEIOU]",""));
