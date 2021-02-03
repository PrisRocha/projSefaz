import java.util.Scanner;

public class IfeElse {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);

		System.out.println("Entre com a idade:");
		int idade = scan.nextInt();
		
		if (idade >= 18){
			System.out.println("Maior de idade");

		}
		
		else {
			
			System.out.println("Menor de idade");
		}

	    // preço do item se for barato <= 10
		// preço do item se estiver por 10 < valor < 15 = pedir desconto
		// preço do item se estiver <= valor 17 = pesquisar mais
		// preço do item se >= 17 = muito caro
		
		System.out.println("Entre com o valor:");
        
		double valor = scan.nextDouble();
		
		if (valor <= 10 ) {
			System.out.println("Está barato pode comprar");
			
		} else if (valor < 10 && valor < 15) {
			System.out.println("Você pode pedir um desconto");

		} else if ( valor >= 15 && valor < 17) {
     		System.out.println("Pesquisar mais");

		} else {
     		System.out.println("Valor muito caro");

		}
		
	}

}
