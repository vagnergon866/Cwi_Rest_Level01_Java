package arrays_vetores;

import java.util.Scanner;

public class Arreys_Vetores_1 {

	public static void main(String[] args) {
             
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int[] valores1 = new int[5];
		for(int i=0; i< valores1.length; i++) {
			
	    System.out.println("Inforeme o valor da posição: " +i);
		valores1[i] = scan.nextInt();
				
		}
		
		int[] valores2 = new int[5];
		for(int i=0; i< valores1.length; i++) {
			valores2[i] = valores1[i] *2;
			
		}
		
		System.out.println("Primeiro vetor: ");
		for(int valor : valores1) {
			System.out.println(valor);
		}
		
		System.out.println("Segundo vetor: ");
		for(int valor : valores2) {
		System.out.println(valor);
		
		}
			
	}

}
