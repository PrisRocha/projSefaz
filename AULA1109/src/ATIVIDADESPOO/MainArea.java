package ATIVIDADESPOO;

import java.util.Scanner;

public class MainArea {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
		  
	System.out.println("Digite 1 para calcular a �rea do Circulo / 2 para calcular a �rea do Tri�ngulo / 3 para calcular a �rea do Quadrado:");
	int entrada;	
	entrada = scan.nextInt();{			
	}
	
	switch(entrada) {
	case 1: System.out.println("Digite o valor do raio: ");
	double raio = scan.nextDouble();
	double area = Math.PI * Math.pow(raio ,2);
	System.out.println("A �rea do circulo �: " + area); break;
	
	case 2: System.out.println("Digite o valor da base:");
    double base = scan.nextDouble();
    System.out.println("Digite o valor da altura:");
    double altura = scan.nextDouble();
    System.out.println("A �rea do Tri�ngulo �:"+ (base*altura)/2); break;
    
	case 3: System.out.println("Digite o valor do lado:");
    double lado = scan.nextDouble();    
    System.out.println("A �rea do quadrado �:" + lado*lado); break;
    
	default: System.out.print("D�gito inv�lido");
	}
	
	}
}
	


