
public class TestaBooleano {
	public static void main(String[] args) {
		System.out.println("Testando condicional 2");
		int idade = 16;
		boolean acompanhado = false;

		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente vc n?o pode entrar");
		}
	}
}
