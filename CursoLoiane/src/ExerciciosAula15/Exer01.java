package ExerciciosAula15;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);

		System.out.println("Entre com o primeiro número:");
        double num1 = scan.nextDouble();
        
		System.out.println("Entre com o segundo número:");
        double num2 = scan.nextDouble();

		if (num1 > num2){
			System.out.println(" O número 1 é maior:" + num1);
			
		} else {
			System.out.println(" O número 2 é maior:" + num2);

		}
		
	}

}
