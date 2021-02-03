
public class Poupanca extends Conta {
	
	public Poupanca ( double saldo, String numero) {
		
    super(saldo, numero);
		
	} 
	
	public void renderJuros (double taxa) {
		
	saldo = saldo + (saldo * taxa);
		
		
	}
	
	

	
	
	
}
