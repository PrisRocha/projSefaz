package ExerciciosAula15;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);

		System.out.println("Entre com o primeiro n�mero:");
        double num1 = scan.nextDouble();
        
		System.out.println("Entre com o segundo n�mero:");
        double num2 = scan.nextDouble();

		if (num1 > num2){
			System.out.println(" O n�mero 1 � maior:" + num1);
			
		} else {
			System.out.println(" O n�mero 2 � maior:" + num2);

		}
		
	}

}
