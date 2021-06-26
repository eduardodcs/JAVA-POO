
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Analista eduardo = new Analista();
		eduardo.setNome("Eduardo");
		eduardo.setCpf("123.123.123-12");
		eduardo.setSalario(1000.00);
		
		System.out.println(eduardo.getNome());
		System.out.println(eduardo.getBonificacao());
		
		

	}

}
