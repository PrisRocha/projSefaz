package ATIVIDADESPOO;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
	  
	Scanner scan = new Scanner(System.in);
	  
	System.out.println("Digite 1 para calcular a área do Circulo / 2 para calcular a área do Triângulo / 3 para calcular a área do Quadrado:");
	int entrada;	
	entrada = scan.nextInt();{
	
	if (entrada != 1 && entrada != 2 && entrada != 3) {
		    
	System.out.print("Digito inválido");
			    	
	}
	
	else if (entrada == 1) {
	 
    System.out.println("Digite o raio do circulo:");
    double raio = scan.nextDouble();
    double area = 2*Math.PI*raio;
    
    System.out.println("A área do circulo é:" + area);
     		
	}
	
	else if (entrada == 2) {
    	
    System.out.println("Digite o valor da base:");
    double base = scan.nextDouble();
    System.out.println("Digite o valor da altura:");
    double altura = scan.nextDouble();
    
    double area = (base*altura)/2;
     
    System.out.println("A área do Triângulo é:" + area);
        
    }
		
	if (entrada == 3){
    
    System.out.println("Digite o valor do lado:");
    double lado = scan.nextDouble();
    
    double area = lado*lado;
    
    System.out.println(" A área do quadrado é:" + area);
    
	}
	}
	
	}

}
