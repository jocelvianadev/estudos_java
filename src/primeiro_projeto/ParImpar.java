package primeiro_projeto;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // classe para entrada de dados
		
		//Variáveis
		byte qtd;		
		byte num;
		byte par = 0;
		byte impar = 0;
		
		//Prineira entrada de dados
		System.out.print("Digite a quantidade de números: ");
		qtd = scan.nextByte();
		
		//Laço
		for(int i = 0;i < qtd; i++) {
			System.out.print((i + 1) + "º número: ");
			num = scan.nextByte();
			
			//Condicional
			if(num % 2 ==0) par++;
			else impar++;
		}
		//Saídas
		 System.out.printf("\n%d número(s) são pares\n",par);
		 System.out.printf("%d número(s) são ímpares.",impar);
		
		scan.close();

	}

}
