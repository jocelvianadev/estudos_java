package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Nome: ");
		funcionario.nome = scan.nextLine();
		System.out.print("Salário bruto: ");
		funcionario.salarioBruto = scan.nextDouble();
		System.out.print("Imposto: ");
		funcionario.imposto = scan.nextDouble();
		
		System.out.println(funcionario);
		
		System.out.print("\nQual a taxa de aumento? ");
		double taxa = scan.nextDouble();
		funcionario.incrementarSalario(taxa);
		
		System.out.println();
		
		funcionario.salarioLiquido();
		
		scan.close();

	}

}
