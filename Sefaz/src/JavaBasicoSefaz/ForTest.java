package JavaBasicoSefaz;

import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean entradaValida = false;
		System.out.println("Digite um número inteiro:");
		int entrada = scan.nextInt();

		if (entrada >= 0) {
			entradaValida = true;
		} else {
			System.out.println("Valor inválido, digite um número a partir de zero!");
		}
		for (int contador = 0; contador <= entrada; contador++) {
			System.out.print(" " + contador);
		}
	}
}
