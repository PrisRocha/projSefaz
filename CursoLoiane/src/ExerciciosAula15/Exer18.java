package ExerciciosAula15;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um n�mero:");
		int num = scan.nextInt();

		if (num % 2 == 0) {
			System.out.println("N�mero PAR");

		} else {
			System.out.println("N�mero �MPAR");

		}
	}

}
