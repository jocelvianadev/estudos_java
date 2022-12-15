package primeiro_projeto;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		byte idade;
		char sexo;
		System.out.print("Digite um nome: ");
		nome = sc.nextLine();
		System.out.print("Digite sua idade: ");
		idade = sc.nextByte();
		System.out.print("Informe o sexo: ");
		sexo = sc.next().charAt(0);
		
		if(sexo == 'm') {
			String genero = "Masculino";
			
			if(idade <= 17) {
				System.out.printf("Desculpe %s, você só tem %d anos, portanto não pode tira a carteira.\n", nome, idade);
				
			}
			else if(idade >= 70) {
				System.out.printf("Desculpe sr. %s, você está velho demais para tirar a carteira!\n", nome);
				System.out.printf("O sexo é %s ",sexo);
			}
			else {
				System.out.printf("Seja bem vindo %s, vamos tirar a carteira de habilitação?\n", nome);
				System.out.printf("O sexo é %s ",sexo);
			}
			
		}else {
		

		}
		sc.close();
	}

}
