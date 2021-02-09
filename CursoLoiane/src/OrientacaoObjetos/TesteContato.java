package OrientacaoObjetos;

public class TesteContato {

	public static void main(String[] args) {
		
		Contato contato1 = new Contato();
		
		contato1.nome = "joão";
		contato1.email = "joao@email.com";
		contato1.endereco = "rua um";
		
		contato1.telefones = new String [5];
		
		contato1.telefones[0] = "99999-9999";
		contato1.telefones[1] = "99999-9998";
		contato1.telefones[2] = "99999-9997";
		
		System.out.println("Telefone:" + contato1.telefones[1]);

	}

}
