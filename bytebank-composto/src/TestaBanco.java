
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente eduardo = new Cliente();
		eduardo.nome = "Eduardo";
		eduardo.cpf = "123.123.123-12";
		eduardo.profissao = "Estudante";
		
		Conta contaDoEduardo = new Conta();
		contaDoEduardo.titular = eduardo;
		contaDoEduardo.deposita(1000);
		
		
		contaDoEduardo.titular.nome = "Eduardo Silva";
		
		System.out.println(contaDoEduardo.titular.nome);
		System.out.println(contaDoEduardo.getSaldo());
		
	}

}
