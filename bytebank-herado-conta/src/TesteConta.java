
public class TesteConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(0001, 325512);
		cc.deposita(100.00);
		
		ContaPoupanca cp = new ContaPoupanca(0002, 856985);
		cp.deposita(125.00);
				
		cc.transfere(30.00, cp);
		
		System.out.println("Saldo CC: " + cc.getSaldo());
		System.out.println("Saldo CP: " + cp.getSaldo());

	}

}
