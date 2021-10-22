package condicionais;

import java.util.Scanner;

public class Condicionais2 {

	public static void main(String[] args) {
		
       @SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
       
       // Digítar um número correspodente aos dias da semana.
       System.out.println("Digíte um número que indica um dia da semana de (1-7)");
       int diaSemana = scan.nextInt();
       
       // Verifica o número que foi digitado e mostra o dia da semana.
       switch(diaSemana){
    	   case 1: System.out.println("Domingo"); break;
    	   case 2: System.out.println("Segunda"); break;
    	   case 3: System.out.println("Terça"); break;
    	   case 4: System.out.println("Quarta"); break;
    	   case 5: System.out.println("Quinta"); break;
    	   case 6: System.out.println("Sexta"); break;
    	   case 7: System.out.println("Sábado"); break;
    	   default : System.out.println("Valor inválido!");
       }
	}

}
