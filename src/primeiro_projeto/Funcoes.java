package primeiro_projeto;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite três números: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
	
		int maior = maiorNumero(num1, num2, num3);
		int menor = menorNumero(num1, num2, num3);
		resultadoMaior(maior);
		resultadoMenor(menor);
			
		scan.close();

	}
	
	// Função que calcula o maior valor
	public static int maiorNumero(int num1 , int num2, int num3) {
		
	    int aux = 0;
		
		//Condicional
		if(num1 > num2 && num1 > num3) 
			aux = num1;		
		else if(num2 > num3) 
			aux = num2;	
		else
			aux = num3;
		
		return aux;
	}
	
	// Função que calcula o menor valor
		public static int menorNumero(int num1 , int num2, int num3) {
			
		    int aux = 0;
			
			//Condicional
			if(num1 < num2 && num1 < num3) 
				aux = num1;		
			else if(num2 < num3) 
				aux = num2;	
			else
				aux = num3;
			
			return aux;
		}
	
	public static void resultadoMaior(int valor) {
		System.out.println("Maior: " + valor);
	}
	public static void resultadoMenor(int valor) {
		System.out.println("Menor: " + valor);
	}

}
