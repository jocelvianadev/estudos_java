package application;

import java.util.Locale;
import java.util.Scanner;

import entidade.Triangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Digite as medidas para X: ");
		x.a = scan.nextDouble();
		x.b = scan.nextDouble();
		x.c = scan.nextDouble();
		
		System.out.println("Agora digite as medidas para Y: ");
		y.a = scan.nextDouble();
		y.b = scan.nextDouble();
		y.c = scan.nextDouble();
		
		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
		System.out.printf("Medidas para X: %.2f%n", areaX);
		System.out.printf("Medidas para Y: %.2f%n", areaY);
		
		
		
		scan.close();
		

	}

}
