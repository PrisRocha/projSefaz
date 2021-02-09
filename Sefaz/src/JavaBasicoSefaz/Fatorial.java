package JavaBasicoSefaz;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		 
		System.out.println("Digite um número inteiro:");
	    int n = scan.nextInt();
	    int fat = 1;
		
	    if (n>=0) {
	    	
	    	for (int i = 1; i <=n; i++) {
	    		fat = fat*i;
	    	} System.out.println("Fatorial é: "+ fat);
	    } else {
			System.out.println("Valor inválido, digite um número a partir de zero!");
	    }
	
	}
}




