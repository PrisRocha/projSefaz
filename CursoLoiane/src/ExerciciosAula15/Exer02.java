package ExerciciosAula15;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com um número:");
        int num = scan.nextInt();
        
        if ( num >= 0){
    		System.out.println("Número posito");
    	
        } else {
    		System.out.println("Número negativo");

        }
		
	}

}
