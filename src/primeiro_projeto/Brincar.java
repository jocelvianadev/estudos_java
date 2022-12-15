package primeiro_projeto;

import java.util.Locale;
import java.util.Scanner;

public class Brincar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Diga seu nome: ");
		String nome = sc.nextLine().toUpperCase();
		System.out.print("Diga sua idade: ");
		byte idade = sc.nextByte();
		sc.nextLine();
		System.out.print("Agora diga sua cidade: ");
		String cidade = sc.nextLine().toUpperCase().trim();
		
		System.out.printf("\nOi, eu me chamo %s, tenho %d anos e moro em %s", nome, idade, cidade);
		
		if(idade >= 18 && idade <= 69) {
			System.out.printf("\nSeja bem-vindo(a) %s, você pode tirar a habilitação.", nome);
		}
		else if(idade > 70) {
			System.out.printf("\nSeja bem-vindo(a) %s, você pode tirar sua habilitação, mas por apenas 3 anos.", nome);
		}
		else {
			System.out.printf("\nDesculpe %s, você não pode tirar sua habilitação.", nome);
		}
		
		sc.close();	    
		
		
	}
		public static void falar() {
		
	}

}
