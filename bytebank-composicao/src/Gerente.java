
public class Gerente extends Funcionario {
	
	private Autenticacao autenticador;

	public Gerente() {
		this.autenticador = new Autenticacao();
	}
	
	
	public double getBonificacao() {
		return super.getSalario();
	}

	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	
}
