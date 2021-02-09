package JavaBasicoSefaz;

import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o número do dia da semana entre 1 á 7:");

		int diaSemana = scan.nextInt();

		switch (diaSemana) {
		case 1:
			System.out.println("domingo");
			break;
		case 2:
			System.out.println("segunda-feira");
			break;
		case 3:
			System.out.println("terça-feira");
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
			System.out.println("sabádo");
			break;
		default:
			System.out.println("não é um dia da semana válido");

		}
		switch (diaSemana) {
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("dia útil");
			break;
		case 1:
		case 7:
			System.out.println("fim de semana");
			break;
		default:
			System.out.println("não é um dia da semana válido");

		}
	}
}
