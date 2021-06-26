
public class Cliente {

	private Autenticacao Autenticador;
	
	public Cliente() {
		this.Autenticador = new Autenticacao();
	}
	
	public void setSenha(int senha) {
		this.Autenticador.setSenha(senha);
	}
	
	public boolean autentica(int senha) {
		return this.Autenticador.autentica(senha);

	}
}
