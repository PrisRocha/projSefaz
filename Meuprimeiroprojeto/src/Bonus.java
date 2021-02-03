
public class Bonus extends Conta {
	private double bonus;
	private static final double BONUS_TAXA = 0.01;
	
	public Bonus(double saldo, String numero) {
	super(saldo, numero);
	
}
	
	public double getBonus() 
	
{
	return this.bonus;
		
}
	public void credita(double valor) {
	this.bonus = this.bonus + (valor* BONUS_TAXA);
	super.credita (valor);
		
}
	
	public void renderBonus() {
		
    super.credita(this.bonus);
	this.bonus = 0;
	
	
}

}
	
