package ExerciciosAula15;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);

		System.out.println("Entre com o primeiro n�mero inteiro:");
        
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo n�mero inteiro:");

		int num2 = scan.nextInt();
		
		System.out.println("Entre com o segundo n�mero inteiro:");

		int num3 = scan.nextInt();
		
		if (num1 >= num2 && num1 >= num3){
			System.out.println("N�mero 1 � maior:" + num1);
		
		} else if ( num2 >= num1 && num2 >= num3){
			System.out.println("N�mero 2 � maior:" + num2);
			
		} else if (num3 >= num1 && num3 >= num2){
			System.out.println("N�mero 3 � maior:" + num3);

		}

	}

}
