package ExerciciosAula15;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o n�mero do dia da semana entre 1 � 7:");

		int diaSemana = scan.nextInt();

		switch (diaSemana) {
		case 1:
			System.out.println("domingo");
			break;
		case 2:
			System.out.println("segunda-feira");
			break;
		case 3:
			System.out.println("ter�a-feira");
			break;
		case 4:
			System.out.println("quarta-feira");
			break;
		case 5:
			System.out.println("quinta-feira");
			break;
		case 6:
			System.out.println("sexta-feira");
			break;
		case 7:
			System.out.println("sab�do");
			break;

		default:
			System.out.println("n�o � um dia da semana v�lido");

		}

	}
}
