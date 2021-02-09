package JavaBasicoSefaz;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um valor de 1 á 4: ");
		int vlr = scan.nextInt();

		switch (vlr) {
		case 1:
			System.out.println("Valor digitado: " + vlr);
			break;
		case 2:
			System.out.println("Valor digitado: " + vlr);
			break;
		case 3:
			System.out.println("Valor digitado: " + vlr);
			break;
		case 4:
			System.out.println("Valor digitado: " + vlr);
			break;

		default:
			System.out.println("não é um valor válido");
		}

	}

}
