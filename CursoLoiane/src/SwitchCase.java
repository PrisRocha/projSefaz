import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);

		System.out.println("Entre com o n�mero do dia da semana entre 1 � 7:");
		
		int diaSemana = scan.nextInt();
		
		if (diaSemana == 1){
			System.out.println("domingo");

		} else if (diaSemana == 2){
			System.out.println("segunda-feira");

		} else if (diaSemana == 3){
			System.out.println("ter�a-feira");

		} else if (diaSemana == 4){
			System.out.println("quarta-feira");
	
	    } else if (diaSemana == 5){
		    System.out.println("quinta-feira");
		    
	    } else if (diaSemana == 6){
		    System.out.println("sexta-feira");
		    
	    } else if (diaSemana == 7){
		    System.out.println("s�bado-feira");
		    
	    } else {
		    System.out.println("n�o � um dia da semana v�lido");
}  
		switch(diaSemana){
		case 1:	System.out.println("domingo"); break;
		case 2:	System.out.println("segunda-feira"); break;
		case 3:	System.out.println("ter�a-feira"); break;
		case 4:	System.out.println("quarta-feira"); break;
		case 5:	System.out.println("quinta-feira"); break;
		case 6:	System.out.println("sexta-feira"); break;
		case 7:	System.out.println("sab�do"); break;

		default: 
		    System.out.println("n�o � um dia da semana v�lido");

		}
		
		switch(diaSemana){
		
		case 2:	
		case 3:	
		case 4:	
		case 5:	
		case 6:	System.out.println("dia �til"); break;

		case 1:	
		case 7:	System.out.println("fim de semana"); break;

		default: 
		    System.out.println("n�o � um dia da semana v�lido");
    }
}
	
}
