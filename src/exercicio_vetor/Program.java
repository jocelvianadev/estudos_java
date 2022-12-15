package exercicio_vetor;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = scan.nextInt();
		String[] nomes = new String[n];
		int[] idades = new int[n];
	    double[] alturas = new double[n];
	    double soma = 0.0;
	    int cont = 0;
	    int contIdade = 0;
	    double percentual = 0.0;
	    double mediaAltura;
	    
	    for(int i = 0; i < n; i++) {
	    	System.out.println("Dados da " + (i + 1) + "ª pessoa:");
	    	System.out.print("Nome: ");
	    	nomes[i] = scan.next();
	    	System.out.print("idade: ");
	    	idades[i] = scan.nextInt();
	    	System.out.print("Altura: ");
	    	alturas[i] = scan.nextDouble();
	    	
	    }
	    //==========================================
	    //Calcular a altura média das pessoas:
	    for(double altura : alturas) {
	    	soma += altura;
	    }
	    System.out.println();
	    mediaAltura = soma / n;
	    System.out.printf("Altura média: %.2f%n",  mediaAltura);
	   
	    //==========================================
	    //Calcular a média de pessoas com menos de 16 anos
	    for(int idade : idades) {
	    	contIdade ++;
	    	if(idade < 16) {
	    		cont += 1;
	    	}
	    }
	    
	    percentual = (contIdade * cont) / 100;	
	    System.out.printf("Percentual de idades menor que 16 anos: %.2f%%%n", percentual);
		scan.close();
	}

}
