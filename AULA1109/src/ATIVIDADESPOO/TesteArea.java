package ATIVIDADESPOO;
import java.util.Scanner;
public class TesteArea {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 1 para calcular a �rea do Circulo / 2 para calcular a �rea do Tri�ngulo / 3 para calcular a �rea do Quadrado:");
		int entrada;	
		entrada = scan.nextInt();

	 Circulo circulo = new Circulo(0, 0, 0);
	 circulo.area();

}
}
