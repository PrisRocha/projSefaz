package JavaBasicoSefaz;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um n�mero inteiro:");
		int i = 0;
		int vlrMax = scan.nextInt();
		boolean vlrMaxValido = false;

		if (vlrMax >= 0) {
			vlrMaxValido = true;
		} else {
			System.out.println("Valor inv�lido, digite um n�mero a partir de zero!");
		}
		System.out.println("Contando de 0 at�:" + vlrMax);
		while (i <= vlrMax) {
			System.out.println(i + " ");
			i++;
		}
		System.out.println("Contando de 0 at�:" + vlrMax);
		i = 0;
		do {
			System.out.println(i + " ");
		} while (++i <= vlrMax);
		scan.close();
	}
}
