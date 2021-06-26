package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoLista {

	public static void main(String[] args) {
		String aula1 = "Java com 00";
		String aula2 = "Java Web";
		String aula3 = "Framework";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		aulas.remove(0);
		System.out.println(aulas);

		
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é " + primeiraAula);
		
		for(int i = 0; i > aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
		}
		
		
		for (String aula : aulas) {
			System.out.println("Nome da Aula: " + aula);			
		}
		
		//Lambda
		aulas.forEach(aula -> {System.out.println("percorrendo " + aula);});
		
		aulas.add("Aumentando nosso conhecimento");
		System.out.println(aulas);
		Collections.sort(aulas);
		System.out.println(aulas);
		
		
		
	}

}
