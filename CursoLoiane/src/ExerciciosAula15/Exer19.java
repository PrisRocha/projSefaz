package ExerciciosAula15;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um n�mero:");
		int num1 = scan.nextInt();
		System.out.println("Entre com um n�mero:");
		int num2 = scan.nextInt();

		System.out.println("Entre com a opera��o ( + - / * ):");
		String operacao = scan.next();

		double resultado = 0;
		boolean valida = true;

		switch (operacao) {
		case "+":
			resultado = num1 + num2;
			break;
		case "-":
			resultado = num1 - num2;
			break;
		case "*":
			resultado = num1 * num2;
			break;
		case "/":
			resultado = num1 / num2;
			break;

		default:
			System.out.println("opera��o inv�lida");
			valida = false;
			break;

		}
		if (valida) {

			System.out.println("Resultado: " + resultado);

			if (resultado >= 0) {
				System.out.println("Positivo");

			} else {
				System.out.println("Negativo");

			}
			if (resultado % 2 == 0) {
				System.out.println("PAR");

			} else {
				System.out.println("�MPAR");

			}
		}
	}

}
