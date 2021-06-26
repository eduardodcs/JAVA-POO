package br.com.bytebank.banco.teste;

public class TesteString {
	public static void main(String[] args) {
		
		String nome = "Eduardo";
		String nome2 = nome.replace("a", "A");
		String nome3 = nome.toUpperCase();
		char c = nome.charAt(2);
		int pos = nome.indexOf("ard");
		String sub = nome.substring(2, 5);
		int tam = nome.length();

		
		
		System.out.println(nome2);
		System.out.println(nome3);
		System.out.println(c);
		System.out.println(pos);
		System.out.println(sub);
		System.out.println(tam);
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i) + "***");
			
		}
		
		
		String vazio = " ";
		String espaco = vazio.trim(); //Retira os espaços
		
		System.out.println(vazio.isEmpty());
		System.out.println(espaco.isEmpty()); //Verifica se a String está vazia
		
		System.out.println("Eduardo contem substring 'ar'? " + nome.contains("ar"));
		
	}
}
