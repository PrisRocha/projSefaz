package ExerciciosAula15;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);

		System.out.println("Entre com uma letra:");

		String letra = scan.next();

		if (letra.length ()>1){
			System.out.println("N�o � uma letra v�lida");

		}
		
		switch(letra){
        
		case "a", "e", "i", "0", "u":
			System.out.println("vogal");break;
			
		case "A", "E", "I", "O","U":
			System.out.println("consoante");break;
		
		default: 
		    System.out.println("consoante");
		
	}

  }
}
