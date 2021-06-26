
public class ContaComExcecaoChecked {
	public static void main(String[] args) {
		Conta c = new Conta();
		try {
			c.deposita();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
