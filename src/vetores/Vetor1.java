package vetores;

import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] nomes = new String[4];
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			nomes[i] = scan.nextLine();
		}
		
		System.out.println("\nNomes digitados:");
		for(String nome : nomes) {
			System.out.println(nome);
		}
		scan.close();	}

}
