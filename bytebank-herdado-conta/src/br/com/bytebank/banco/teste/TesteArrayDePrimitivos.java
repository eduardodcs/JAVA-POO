package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {
	public static void main(String[] args) {
				
		int[] idades = new int[5];
		
		idades[0] = 29;
		idades[1] = 43;
		idades[2] = 53;
		idades[3] = 42;
		idades[4] = 97;
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
	}
}
