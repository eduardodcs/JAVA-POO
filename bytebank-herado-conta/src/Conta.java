
public abstract class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total ++;
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Acabou de ser criada a conta: " + this.numero);
		System.out.println("Agora temos " + Conta.total + " contas criadas.");
		System.out.println();
		
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(agencia <= 0) {
			System.out.println("O n?mero da Conta n?o pode ser negativo");
			return;
		}
		this.numero = numero;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("O n?mero da Ag?ncia n?o pode ser negativo");
			return;
		}
		this.agencia = agencia;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return total;
	}
}
