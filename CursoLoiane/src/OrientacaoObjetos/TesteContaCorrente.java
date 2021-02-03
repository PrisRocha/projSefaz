package OrientacaoObjetos;

public class TesteContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.numero = "123";
		conta.aagencia = "1234";
		conta.especial = true;
		conta.limiteEspecial = 100;
		conta.saldo = -5;
		
		System.out.println("Saldo da conta:" + conta.saldo);
		
	}

}
