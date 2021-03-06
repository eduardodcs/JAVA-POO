package br.com.alura;

public class TestaAlunoComAluno {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as cole??es", "Paulo Silveira");
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 19));
		javaColecoes.adiciona(new Aula("Trabalhando com OO", 15));
		javaColecoes.adiciona(new Aula("Arrumando as ArrayList", 23));


		Aluno a1 = new Aluno("Eduardo Silva", 125632);
		Aluno a2 = new Aluno("Fabricio Costa", 854785);
		Aluno a3 = new Aluno("Marcos Barroso", 489452);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos" );
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
		Aluno eduardo = new Aluno("Eduardo Silva", 1232);
		
		System.out.println("O aluno A1 est? matriculado?");
		System.out.println(javaColecoes.estaMatriculado(eduardo));

		System.out.println("O A1 ? equals ao Eduardo?");
		System.out.println(a1.equals(eduardo));
		
		
		
	}

}
