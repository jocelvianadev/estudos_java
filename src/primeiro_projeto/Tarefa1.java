/*
DE: JOCEL VIANA
ESTE É UM PROGRAMA PARA TREINAR MEUS CONHECIMENTOS EM LINGUAGEM JAVA
DATA: 12/10/2022
 */
package primeiro_projeto;

import java.util.Locale;

public class Tarefa1 {

	public static void main(String[] args) {
		String produto1 = "Computador";
		String produto2 = "Mesa de escritório";
		
		byte idade = 30;
		int codigo = 5290;
		char sexo = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double media = 53.234567;
		
		System.out.println("Produtos:");
		System.out.printf("%s, cujo preço é R$ %.2f\n", produto1, preco1);
		System.out.printf("%s, cujo preço é R$ %.2f\n", produto2, preco2);
		
		System.out.printf("\nRecord: %d anos, codigo %d e gênero: %s\n", idade, codigo, sexo);
		
		System.out.printf("\nMedida com oito casas decimais: %.8f\n", media);
		System.out.printf("Arredondado (três casas decimais): %.3f\n", media);
		Locale.setDefault(Locale.US);
		System.out.printf("Usando a formatação norte-americana: %.3f", media);

	}

}
