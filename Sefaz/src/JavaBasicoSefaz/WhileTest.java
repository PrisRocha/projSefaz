package JavaBasicoSefaz;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número inteiro:");
		int i = 0;
		int vlrMax = scan.nextInt();
		boolean vlrMaxValido = false;

		if (vlrMax >= 0) {
			vlrMaxValido = true;
		} else {
			System.out.println("Valor inválido, digite um número a partir de zero!");
		}
		System.out.println("Contando de 0 até:" + vlrMax);
		while (i <= vlrMax) {
			System.out.println(i + " ");
			i++;
		}
		System.out.println("Contando de 0 até:" + vlrMax);
		i = 0;
		do {
			System.out.println(i + " ");
		} while (++i <= vlrMax);
		scan.close();
	}
}
