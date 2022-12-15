package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual o valor do dólar? ");
		double precoDolar = scan.nextDouble();
		scan.nextLine();
		System.out.print("Quantos dólares serão comprados? ");
		double quantia = scan.nextDouble();
		
		double resultado = Converte.calculo(quantia, precoDolar);
		
		System.out.printf("\nValor pago: R$ %.2f%n", resultado);
		
		
		scan.close();

	}

}
