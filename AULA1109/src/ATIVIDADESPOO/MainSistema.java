package ATIVIDADESPOO;

import java.util.Scanner;

public class MainSistema {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();

		System.out.print("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();

		Aluno aluno1 = new Aluno(nota1, nota2);
		
		double media  = aluno1.getMedia();
		System.out.println("A média do aluno com nota 1: "+aluno1.getNota1()+" e nota2: "+aluno1.getNota2()+" sé igual "+media +" e seus status é: "+aluno1.getStatus());

		double notaFinal = aluno1.getNotaMinimaParaPassarNaFinal();
		if(notaFinal != -1)
		{
		System.out.println("A nota minima para o aluno passar na final é: "+notaFinal);
		}
	}
}
