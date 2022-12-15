package conta;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		 Conta conta;
		
		
		System.out.print("Número da conta: ");
		int numConta = scan.nextInt();
		System.out.print("Titular da conta: ");
		scan.nextLine();
		String nome = scan.nextLine();
		System.out.print("Vai ter saldo inical? s/n ");
		char verificacao = scan.next().charAt(0);
		
		
		if(verificacao == 's') {
			System.out.print("Valor do depósito: R$ ");
			double deposito = scan.nextDouble();
			conta = new Conta(numConta, nome, deposito);
		}
		else {
			conta = new Conta(numConta, nome);
		}
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Informe o valor de um depósito: R$ ");
		double valor = scan.nextDouble();
		conta.depositar(valor);
		
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Informe o valor do saque: R$ ");
		double valorSaque = scan.nextDouble();
		conta.sacar(valorSaque);
	
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(conta);
		
		
		scan.close();

	}

}
