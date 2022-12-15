package primeiro_projeto;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		System.out.println("|================================|");
		System.out.println("|                                |");
		System.out.println("|         SOMA DE NÚMEROS        |");
		System.out.println("|                                |");
		System.out.println("|================================|");
		
		Scanner scan = new Scanner(System.in);
		int soma = 0;
		System.out.print("\nQuantos números você quer somar? ");
		int qtd_numeros = scan.nextInt();
		System.out.println("");
		
		for(int i = 0; i < qtd_numeros; i++) {
			System.out.print("Informe o " + (i + 1) + "º número: ");
			int num = scan.nextInt();
			soma += num;
		}
		
		System.out.printf("\nA soma de todos os números é %d", soma);
		
		System.out.println("\n========FIM DO PROGRAMA========");
		
		scan.close();

	}

}
