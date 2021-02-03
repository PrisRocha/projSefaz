package ATIVIDADESPOO;

import java.util.*;
public class Triangulo {
	
	Scanner scan = new Scanner (System.in);
	
	protected double base;
	protected double altura;
	protected double area;
	protected double entrada;
	
	Triangulo (){
	this.base = base;
	this.altura = altura;
	this.area = area;

	if (entrada == 2) {
    	
	    System.out.println("Digite o valor da base:");
	    double base = scan.nextDouble();
	    System.out.println("Digite o valor da altura:");
	    double altura = scan.nextDouble();
	    double area = (base*altura)/2;
	    System.out.println("A área do Triângulo é:" + area);

}
	
	}
}

