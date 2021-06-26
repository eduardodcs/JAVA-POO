
public class TestaGetESet {
	public static void main(String[] args) {
		
		Conta conta = new Conta(2525, 10002566);
		conta.setNumero(1337);
		
		Cliente eduardo = new Cliente();
		eduardo.setNome("Eduardo");
		
		conta.setTitular(eduardo);
		
		
		
		
		System.out.println(conta.getTitular().getNome());
		
	}
}
