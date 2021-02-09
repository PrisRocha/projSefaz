package Encapsulamento;

public class TesteCarro {

	public static void main(String[] args) {

		Carro van = new Carro ();
		
		van.setMarca("Fiat"); // set = atribuir valor
		
		System.out.println(van.getMarca()); // get = obter valor
		
	}

}
