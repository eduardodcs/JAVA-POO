package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaEduardo = new Conta();
		Conta contaRenaria = new Conta();
		
		contaEduardo.deposita(1000);
		contaEduardo.transfere(300, contaRenaria);
		
		System.out.println("Saldo Eduardo: " + contaEduardo.saldo);
		System.out.println("Saldo Renaria: " + contaRenaria.saldo);
		
	}
}
