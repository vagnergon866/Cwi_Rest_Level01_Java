package condicionais;

import java.util.Scanner;

public class Condicionais2 {

	public static void main(String[] args) {
		
       @SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
       
       // Dig�tar um n�mero correspodente aos dias da semana.
       System.out.println("Dig�te um n�mero que indica um dia da semana de (1-7)");
       int diaSemana = scan.nextInt();
       
       // Verifica o n�mero que foi digitado e mostra o dia da semana.
       switch(diaSemana){
    	   case 1: System.out.println("Domingo"); break;
    	   case 2: System.out.println("Segunda"); break;
    	   case 3: System.out.println("Ter�a"); break;
    	   case 4: System.out.println("Quarta"); break;
    	   case 5: System.out.println("Quinta"); break;
    	   case 6: System.out.println("Sexta"); break;
    	   case 7: System.out.println("S�bado"); break;
    	   default : System.out.println("Valor inv�lido!");
       }
	}

}
