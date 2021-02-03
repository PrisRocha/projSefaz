package ATIVIDADESPOO;

import java.util.Scanner;

public class MainArea {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
		  
	System.out.println("Digite 1 para calcular a área do Circulo / 2 para calcular a área do Triângulo / 3 para calcular a área do Quadrado:");
	int entrada;	
	entrada = scan.nextInt();{			
	}
	
	switch(entrada) {
	case 1: System.out.println("Digite o valor do raio: ");
	double raio = scan.nextDouble();
	double area = Math.PI * Math.pow(raio ,2);
	System.out.println("A área do circulo é: " + area); break;
	
	case 2: System.out.println("Digite o valor da base:");
    double base = scan.nextDouble();
    System.out.println("Digite o valor da altura:");
    double altura = scan.nextDouble();
    System.out.println("A área do Triângulo é:"+ (base*altura)/2); break;
    
	case 3: System.out.println("Digite o valor do lado:");
    double lado = scan.nextDouble();    
    System.out.println("A área do quadrado é:" + lado*lado); break;
    
	default: System.out.print("Dígito inválido");
	}
	
	}
}
	


