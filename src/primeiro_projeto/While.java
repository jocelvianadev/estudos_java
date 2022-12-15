package primeiro_projeto;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		//System.out.print("Informe um número: ");
		int num = -1;//scan.nextInt();
		int soma = 0;
		while(num != 0) {
			System.out.print("Digite um número ou zero para sair: ");
			num = scan.nextInt();
			soma += num;
		}
		
		System.out.println("\nA soma dos números é " + soma);
		 System.out.println("=====FIM DO PROGRAMA=====");
		
		scan.close();

	}

}
