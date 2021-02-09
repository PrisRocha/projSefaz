package ExerciciosAula15;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a quantidade em kg de MORANGO:");
		double qtdMorango = scan.nextDouble();
		System.out.println("Entre com a quantidade em kg de MAÇÃ:");
		double qtdMaca = scan.nextDouble();
		double precMorango = 2.50;
		double precMaca = 1.80;

		if (qtdMorango <= 5) {
			precMorango = 2.50;
		} else {
			precMorango = 2.20;
		}
		if (qtdMaca <= 5) {
			precMaca = 1.80;
		} else {
			precMaca = 1.50;
		}
		double precoTotalMorango = qtdMorango * precMorango;
		double precoTotalMaca = qtdMaca * precMaca;

		double precParcial = precMorango + precMaca;
		double precTotal = precParcial;

		if ((qtdMorango + qtdMaca > 8) || precParcial > 25) {
			precTotal = precParcial - ((precParcial / 100) * 10);
		}
		System.out.println("Preço Total = " + precTotal);
	}

}
