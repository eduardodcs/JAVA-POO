package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as cole??es", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 19));
		javaColecoes.adiciona(new Aula("Trabalhando com OO", 15));
		javaColecoes.adiciona(new Aula("Arrumando as ArrayList", 23));
		javaColecoes.adiciona(new Aula("Arrumando as ArrayList", 23));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println("Tempo Total: " + javaColecoes.getTempoTotal());
		
		System.out.println("---------------------------");
		
		System.out.println(javaColecoes);
		
		
		
//		List<Aula> aulas = javaColecoes.getAulas();
//		System.out.println(aulas);
//		
//		aulas.add(new Aula("Trabalhando com ArrayList", 21));
//		System.out.println(aulas);
//		
//		System.out.println(javaColecoes.getAulas());
//		System.out.println(aulas == javaColecoes.getAulas());
	}

}
