package ATIVIDADESPOO;

import java.util.Scanner;

public class MainHoraExtra {

	public static void main(String[] args) {
		
		System.out.println("Digite os dados:");
		
		Scanner sc = new Scanner (System.in);
		
		String entrada = sc.nextLine();

		String [] entradaSplit= entrada.split(" ");
		String strdiaSemana = entradaSplit[0];
		String strhoraExtra = entradaSplit [1];
		String strhoraEntrada = entradaSplit[2];
		String strHoraSaida = entradaSplit[2];
		String strvalorHora = entradaSplit[3];
		
		DiaSemana diaSemana = DiaSemana.getDiaSemana(strdiaSemana);
		int horaEntrada = Integer.parseInt(entrada);
		int horaSaida = Integer.parseInt(strHoraSaida);
		double valorHora = Double.parseDouble(strvalorHora);
			
		RegistroPonto registroPonto = new RegistroPonto(diaSemana, horaEntrada, horaSaida, valorHora);
		
		System.out.println(registroPonto.calculaValorHora());

	}

}
