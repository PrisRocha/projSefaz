package JavaBasicoSefaz;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean anoValido = false;
		System.out.println("Digite o seu Nome:");
		String nome = scan.nextLine();
		int anoNasc;

		do {
			System.out.println("Digite o ano do seu Nascimento:");
			anoNasc = scan.nextInt();

			if (anoNasc > 0 && anoNasc <= 2021) {
				anoValido = true;
			} else {
				System.out.println("Ano de nascimento inválido, digite novamente.");
			}
		} while (!anoValido);
		{
			Calendar cal = GregorianCalendar.getInstance();
			int idade = (cal.get(Calendar.YEAR) - anoNasc);
			String maiorMenor = (idade >= 18) ? "Maior de Idade" : "Menor de Idade";
			System.out.println("Nome:" + nome + "\r\n" + "Idade:" + idade + " anos, " + maiorMenor);
		}

	}

}
