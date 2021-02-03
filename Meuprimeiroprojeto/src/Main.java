
public class Main {
	
	
public static void main(String[] args) {
		
		Conta conta1  = new Conta (100, "123");
		Poupanca poupanca = new Poupanca( 100, "456");
		System.out.println(poupanca.getSaldo());
		poupanca.credita(200);
		System.out.println(poupanca.getSaldo());
		double taxa = 0.01;
		
		poupanca.renderJuros(0.01);
		
		System.out.println(poupanca.getSaldo());
        
		Bonus bonus = new Bonus (100, "678");
		System.out.println("Saldo da conta bonus:" + bonus.saldo);
	    bonus.credita(300);
	    System.out.println("Saldo atual:" + bonus.saldo);
	    bonus.renderBonus();
	    System.out.println("Atual:" + bonus.saldo);
	    
	}
	
}
