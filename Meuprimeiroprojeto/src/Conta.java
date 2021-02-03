
public class Conta {
	
	protected double saldo;
	protected String numero;
	
	
	public Conta (double saldo, String numero) {
		this.saldo=saldo;
		this.numero=numero;
	}
	
	public void credita(double valor) {
	this.saldo+=valor;
	
	}
	
	public double debita (double valor) {
    return this.saldo -= valor;
	
	}
    public String getNumero() {
	return this.numero;
    }
    
    public void setNumero (String numero) {
    	this.numero = numero;
    }
    
    public double getSaldo() {
    	return this.saldo;
    }
    
    public void setSaldo(double saldo) {
    	this.saldo = saldo;
	
}
}
