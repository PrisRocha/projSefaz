package ExerciciosAula15;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o tipo da Carne:");
		System.out.println("1 - filé duplo");
		System.out.println("2 - alcatra");
		System.out.println("3 - picanha");

		int tipo = scan.nextInt();

		System.out.println("Entre com a quantidade em kg:");
		double qtd = scan.nextDouble();
		double precKg = 0;

		if (tipo == 1) {
			if (qtd < 5) {
				precKg = 4.90;
			} else {
				precKg = 5.80;
			}
		} else if (tipo == 2) {
			if (qtd < 5) {
				precKg = 5.90;
			} else {
				precKg = 6.80;
			}
		} else if (tipo == 3) {
			if (qtd < 5) {
				precKg = 6.90;
			} else {
				precKg = 7.80;
			}
		}
		
	}
}
