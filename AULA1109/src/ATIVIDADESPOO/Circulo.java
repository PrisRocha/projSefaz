package ATIVIDADESPOO;
import java.util.*;
public class Circulo {
	
	Scanner scan = new Scanner (System.in);

	protected double area;
	protected double raio;
	protected double entrada;
	
	Circulo (double area, double raio, double entrada){
		this.area = area;
		this.raio = raio;
	
	if (entrada == 1) {
	System.out.println("Digite o valor do raio: ");
	raio = scan.nextDouble();
	area = Math.PI * Math.pow(raio ,2);
	System.out.println("A área do circulo é:" + area);
  
	}
	}
}
