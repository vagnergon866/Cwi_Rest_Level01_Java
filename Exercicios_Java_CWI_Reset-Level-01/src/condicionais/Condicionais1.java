package condicionais;

import java.util.Scanner;

public class Condicionais1 {

	public static void main(String[] args) {
                 
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Digite sua nota de Portugu�s:");
		double notaPort = scan.nextInt();
		
		System.out.println("Digite sua nota de Matem�tica:");
		double notaMat = scan.nextInt();
		
		System.out.println("Digite sua nota de F�sica:");
		double notaFisica = scan.nextInt();
		
		System.out.println("Digite sua nota de Filosofia:");
		double notaFil = scan.nextInt();
		
		// Calculo da media das notas:
		double media = (notaPort + notaMat + notaFisica + notaFil) / 4;
		
		// Verifica se o aluno foi aprovado ou n�o:
		if (media < 7) {
			System.out.println("Aluno reprovado! Sua M�dia foi: "+ media);
		} 
		else if (media >=7 && media <= 9) {
			System.out.println("Aluno Aprovado! Sua M�dia foi:"+ media);
		}
		else if (media == 10) {
			System.out.println("Aluno Aprovado com Louvores! Sua M�dia foi: "+ media);
		}
		else {
			System.out.println("Voc� est� acima da m�dia 10! Tem algo errado com sua nota!");
		}
		
	}
	    
}
	
	

