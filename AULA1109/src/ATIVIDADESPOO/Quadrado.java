package ATIVIDADESPOO;

import java.util.*;

public class Quadrado {
	
	Scanner scan = new Scanner (System.in);
	
    double lado;
    double area;
    double entrada;
    
    Quadrado (){
	this.lado =lado;
	this.area = area;
	
	if (entrada == 3){
	    
	    System.out.println("Digite o valor do lado:");
	    lado = scan.nextDouble();	    
	    area = lado*lado;    
	    System.out.println(" A área do quadrado é:" + area);
	
    }
}
}