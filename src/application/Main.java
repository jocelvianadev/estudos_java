package application;

import java.util.Locale;
import java.util.Scanner;

import entidade.Triango;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Triango trianguloA = new Triango();
		Triango trianguloB = new Triango(); 
		
		System.out.println("Informe as medidas do triângulo A: ");
		trianguloA.ladoA = scan.nextDouble();
		trianguloA.ladoB = scan.nextDouble();
		trianguloA.ladoC = scan.nextDouble();
		
		System.out.println("Informe as medidas do triângulo B: ");
		trianguloB.ladoA = scan.nextDouble();
		trianguloB.ladoB = scan.nextDouble();
		trianguloB.ladoC = scan.nextDouble();
		
		System.out.printf("\nTriângulo A: %.3f%n", trianguloA.area());
		System.out.printf("Triângulo B: %.3f", trianguloB.area());
		
		if(trianguloA.area() > trianguloB.area())
			System.out.printf("\nA maior área é: %.3f%n", trianguloA.area());
		else
			System.out.printf("\nA maior área é: %.3f%n", trianguloB.area());
		
		scan.close();
	}

}
