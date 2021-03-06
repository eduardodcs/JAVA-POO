package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		alunos.add("Eduardo Silva");
		alunos.add("Rodrigo Teixeira");
		alunos.add("Fabiano Costa");
		alunos.add("Jose Barbosa");
		alunos.add("Jose Barbosa");
		
		boolean eduardoEstaMatriculado = alunos.contains("Eduardo Silva");
		System.out.println(eduardoEstaMatriculado);
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println(alunos);
		System.out.println(alunos.size());
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
			}

}
