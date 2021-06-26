
public class Analista extends Funcionario {

	
	private Autenticacao autenticador;

	public Analista() {
		this.autenticador = new Autenticacao();
	}
	
	public double getBonificacao() {
		return super.getSalario() * 0.2;		
	}
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
