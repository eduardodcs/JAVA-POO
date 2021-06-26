
public class Analista extends Funcionario {

	public double getBonificacao() {
		return super.getSalario() * 0.2;		
	}
}
