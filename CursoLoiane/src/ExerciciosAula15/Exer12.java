package ExerciciosAula15;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o valor/hora:");
		double valorHora = scan.nextDouble();

		System.out.println("Entre com as horas trabalhadas no mês:");
		double horasMes = scan.nextDouble();
		
		double salarioBruto = valorHora * horasMes;

		int percentualIR = 0;
		if (salarioBruto<=900) {
			percentualIR = 0;
		} else if (salarioBruto>900 && salarioBruto<=1500) {
			percentualIR = 5;
		} else if (salarioBruto>1500 && salarioBruto <=2500) {
			percentualIR = 10;
		} else if (salarioBruto >2500) {
			percentualIR = 20;
		} double ir = (salarioBruto / 100) * percentualIR;
		double inss = (salarioBruto / 100) * 10;
	
		double fgts = (salarioBruto / 100) * 11;
		double totalDescontos = ir + inss;
		double salarioLiquido = salarioBruto - totalDescontos;

		System.out.println("Salário Bruto:" + valorHora + " * " + horasMes +" * " + salarioBruto);
		System.out.println("Inss:" + inss);
		System.out.println("FGTS:" + fgts);
		System.out.println("Ir:" + ir);
		System.out.println("total de Descontos:" + totalDescontos);
		System.out.println("Salário Liquído:" + salarioLiquido);

	}

}
