
public class TesteReferencias {
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setSalario(5000.00);
				
		Analista analista = new Analista();
		analista.setSalario(2000.00);
		
		
		ControlaBonificacao controle = new ControlaBonificacao();
		controle.registra(analista);
		controle.registra(gerente);
		System.out.println(controle.getSoma());
		
		gerente.setSenha(2525);
		gerente.autentica(255);
		
	}
}
