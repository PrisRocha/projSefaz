package ExerciciosAula15;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o turno que voc� estuda:");

		String turno = scan.next();

		switch(turno){
		case "m":	
		case "M":	System.out.println("bom dia!"); break;
		case "v":	
		case "V":	System.out.println("boa tarde!"); break;
		case "n":	
		case "N":	System.out.println("boa noite!"); break;
		
		default: System.out.println("digito inv�lido!");

		}

	}

}
