package datas;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Digite o nome: ");
		String nome = scan.nextLine();
		//scan.nextLine();
		System.out.print("Código: ");
		int codigo = scan.nextInt();
		System.out.print("Média do aluno: ");
		double media = scan.nextDouble();
		
		Aluno aluno = new Aluno(nome, codigo, media);

		System.out.println(aluno.toString());
		
		if(media < 7.0)
			System.out.println("Aluno não-aprovado!");
		else
			System.out.println("Aluno aprovado!");
		
		
		scan.close();
	}

}
