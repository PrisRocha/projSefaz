import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
		
		int numero1;
		int numero2;
		
		System.out.println("Entre com o primeiro n�mero:");
		numero1 = scan.nextInt();
		
		System.out.println("Entre com segundo n�mero:");
		numero2 = scan.nextInt();

		int resultado = numero1 + numero2;
		System.out.println("A soma dos n�meros �:" + resultado);
		
	}

}
