package ATIVIDADESPOO;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
	  
	Scanner scan = new Scanner(System.in);
	  
	System.out.println("Digite 1 para calcular a �rea do Circulo / 2 para calcular a �rea do Tri�ngulo / 3 para calcular a �rea do Quadrado:");
	int entrada;	
	entrada = scan.nextInt();{
	
	if (entrada != 1 && entrada != 2 && entrada != 3) {
		    
	System.out.print("Digito inv�lido");
			    	
	}
	
	else if (entrada == 1) {
	 
    System.out.println("Digite o raio do circulo:");
    double raio = scan.nextDouble();
    double area = 2*Math.PI*raio;
    
    System.out.println("A �rea do circulo �:" + area);
     		
	}
	
	else if (entrada == 2) {
    	
    System.out.println("Digite o valor da base:");
    double base = scan.nextDouble();
    System.out.println("Digite o valor da altura:");
    double altura = scan.nextDouble();
    
    double area = (base*altura)/2;
     
    System.out.println("A �rea do Tri�ngulo �:" + area);
        
    }
		
	if (entrada == 3){
    
    System.out.println("Digite o valor do lado:");
    double lado = scan.nextDouble();
    
    double area = lado*lado;
    
    System.out.println(" A �rea do quadrado �:" + area);
    
	}
	}
	
	}

}
