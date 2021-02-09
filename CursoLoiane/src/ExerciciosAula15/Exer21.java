package ExerciciosAula15;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a quantidade de litros vendidos:");
		double litros = scan.nextDouble();
		System.out.println("Entre o tipo de combustivel A para alcool e G para gasolina:");
		String tipo = scan.next();

		double precoGas = 2.50;
		double precoAlc = 1.90;
		int percentualDesconto = 0;
		double total = 0;
		double totalDesconto = 0;

		if (tipo.equalsIgnoreCase("a")) {
			if (litros <= 20) {
				percentualDesconto = 3;			
		}else {
				percentualDesconto = 5;
			} total = litros * precoAlc;
			
		} else if (tipo.equalsIgnoreCase("g")) {
			percentualDesconto = 5;
		}
		if (litros <= 20) {
			percentualDesconto = 4;
		} else {
			percentualDesconto = 6;
		} total = litros * precoGas;
			
		totalDesconto = (total /100 *percentualDesconto);
		double precoApagar = total - totalDesconto;
		System.out.println("Valor a ser pago: " + precoApagar);
}
	}

	
