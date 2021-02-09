package JavaBasicoSefaz;

public class Conta {

	String numeroConta;
	double saldo;

	void debitar(double valor) {
		this.saldo = this.saldo - valor;
	}

	void creditar(double valor) {
		this.saldo = this.saldo - valor;
	}

	void transfer(Conta contaDestino, double valor) {
	
	}
}
