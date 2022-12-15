package estoque;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Dados do produto: ");
		System.out.print("Nome: ");
		produto.nome = scan.nextLine();
		System.out.print("Preço: ");
		produto.preco = scan.nextDouble();
		System.out.print("Quantidade no estoque: ");
		produto.quantidade = scan.nextInt();
		
		//EXIBIR INFORMAÇÕES DO PRODUTO
		System.out.println("\n" + produto.toString());
		
		System.out.println();
		
		//ADICIONAR PRODUTOS
		System.out.print("Quantos produtos deseja adicionar? ");
		int quantidade = scan.nextInt();
		produto.adicionarProdutos(quantidade);
		
		//EXIBIR INFORMAÇÕES DO PRODUTO
		System.out.println("\nAtualização:\n" + produto.toString());
		
		//REMOVER PRODUTOS
		System.out.print("\nQuantos produtos deseja remover? ");
		quantidade = scan.nextInt();
		produto.removerProdutos(quantidade);
				
		//EXIBIR INFORMAÇÕES DO PRODUTO
		System.out.println("\nAtualização:\n" + produto.toString());
		
		scan.close();
	}

}
