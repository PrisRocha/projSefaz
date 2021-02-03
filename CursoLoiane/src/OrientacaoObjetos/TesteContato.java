package OrientacaoObjetos;

public class TesteContato {

	public static void main(String[] args) {
		
		Contato contato1 = new Contato();
		
		contato1.nome = "joao";
		contato1.email = "joao@email.com";
		contato1.endereco = "rua um";
		
		contato1.telefone = new String [5];
		
		contato1.telefone[0] = "99999-9999";
		
		System.out.println("Telefone:" + contato1.telefone);

	}

}
