package primeiro_projeto;

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float planoBasico = 50.00f;
		float minutos;
		
		System.out.print("Informe quantos minutos foram usados: ");
		minutos = sc.nextFloat();
		sc.close();
		
		if(minutos <= 100) {
			System.out.printf("Você só vai pagar R$ %.2f", planoBasico);
		}else if(minutos > 100) {
			float novoValor = ((minutos - 100) * 2) + (float)planoBasico;
			System.out.println("Você vai pagar R$ " + novoValor);
		}

	}

}
