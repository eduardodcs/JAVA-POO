
public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Eduardo Silva");
		g1.setCpf("123.123.123-12");
		g1.setSalario(5000.00);
		
		g1.setSenha(2525);
		
		System.out.println(g1.autentica(0)); 
		System.out.println("Bonificação: " + g1.getBonificacao()); 
	}
}
