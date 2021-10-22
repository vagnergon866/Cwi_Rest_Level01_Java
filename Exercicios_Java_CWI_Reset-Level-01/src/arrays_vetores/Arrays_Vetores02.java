package arrays_vetores;

import java.util.Scanner;

public class Arrays_Vetores02 {

	public static void main(String[] args) {
             
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		// Vetor guarda a idade de 10 pessoas.
		
		int[] idades = new int[10];
	    for (int i=0; i< idades.length; i++) {
	    	System.out.println("Informa a idade da pessoa que corresponde ao vetor: "+i);
	    	idades[i] = scan.nextInt();
	    }
	    
	    // Verifica as pessoas que são maiores de idade.
	    
	    int maiorIdade = 0;
	    for(int idade : idades) {
	    	if(idade >= 18) {
	    	maiorIdade++;
	    	}
	    	
	    }
	    
	    // verifica todas as idades do vetor. 
	    
	    System.out.println("Todas as idades: ");
	    for(int idade : idades) {
	    	System.out.println(idade);
	    }
	    
        System.out.println("Número de pessoas maior de idade: "+ maiorIdade);
	}

}
