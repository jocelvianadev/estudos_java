package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double soma = 0.0;
		double media = 0.0;
		double maior = 0.0;
		double menor = 50000;
		
		System.out.print("Deseja digitar quantos números? ");
		int num = scan.nextInt();
		double[] vetor = new double[num];
		
		for(int i = 0; i < num; i++){
			System.out.print("Digite o " + (i + 1) + "º número: ");
			vetor[i] = scan.nextDouble();
			soma += vetor[i];
			if(vetor[i] > maior) {
				maior = vetor[i];
			}
			if(vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		
		media = soma / num;
		
		
		System.out.printf("Média: %.2f%n", media);
		System.out.println("O Maior número é " + maior);
		System.out.println("O menor é " + menor);
		
		scan.close();
	}

}
