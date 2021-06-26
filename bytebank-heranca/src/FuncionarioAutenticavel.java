
public abstract class FuncionarioAutenticavel extends Funcionario {

	@Override
	public double getBonificacao() {
		return 0;
	}

	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Pode entrar no sistema");
			return true;
		} else {
			System.out.println("Não pode entrar no sistema");
			return false;
		}
	}
}
