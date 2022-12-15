package primeiro_projeto;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] nomes = new String[5];
		
		for(int i = 0; i < nomes.length; i ++) {
			System.out.print((i + 1) + "º nome: ");
			nomes[i] = scan.next();
			scan.nextLine();
		}
		System.out.println();
		
		//Estrutura forEach
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
		scan.close();

	}

}
