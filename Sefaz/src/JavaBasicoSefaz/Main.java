package JavaBasicoSefaz;

public class Main {

	public static void main(String[] args) {

		Conta objetoConta = new Conta ();
		
		System.out.println(objetoConta.numeroConta + " " + objetoConta.saldo);
		objetoConta.debitar(100);
			
	}

}
