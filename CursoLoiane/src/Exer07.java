import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);

		System.out.println("Entre com o lado do quadrado:");
		double lado = scan.nextDouble();
		
		double area = Math.pow(lado, 2);
		System.out.println("A area do quadrado �:" + area);

		System.out.println("O dobro da area do quadrado �:" + (area * 2));

		
	}

}
