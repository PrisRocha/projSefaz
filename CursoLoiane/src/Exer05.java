import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com a quantidade em metros:");
		double metros = scan.nextDouble();
		
		// 1 metro são 100 cm
		double cm = metros * 100;
		System.out.println( metros +" metros é igual a:" + cm + "centimentros");
		
		
	}

}
