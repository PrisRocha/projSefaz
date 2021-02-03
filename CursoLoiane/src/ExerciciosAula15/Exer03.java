package ExerciciosAula15;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com uma letra F ou M:");
        
		String letra = scan.next();
		
		if (letra.equalsIgnoreCase("f")){
			System.out.println("Sexo femenino");

		} else if (letra.equalsIgnoreCase("m")) {
			System.out.println("Sexo masculino");

		} else {
			System.out.println("Sexo inválido");

		}

	}

}
