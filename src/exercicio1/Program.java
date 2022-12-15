package exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Informe as medidas do retângulo, altura e largura: ");
		retangulo.altura = scan.nextDouble();
		retangulo.largura = scan.nextDouble();
		
		System.out.printf("Área: %.2f%n", retangulo.area());
		System.out.printf("Perímetro: %.2f%n", retangulo.perimetro());
		System.out.printf("Diagonal: %.2f%n", retangulo.diagonal());
		
		
		scan.close();
	}

}
