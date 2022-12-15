package primeiro_projeto;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Configurar a saída com ponto, ao invés de vírgula nos números 
		String nome = "Jocel Viana";
		byte idade = 100;
		double peso = 145.78634;
		char sexo = 'M';
		
		if(idade >= 18 & sexo == 'M') {
			System.out.printf("Olá %s, você tem %d anos. Seja bem-vindo ao Java\n", nome, idade);
			System.out.println("Você é do sexo masculino!");
		}
		else {
			System.out.println("Descuple " + nome + ", você só tem " + idade + " anos!");
		}
		
		
		System.out.printf("Olá, você pesa %.3f kg", peso);
	}

}
