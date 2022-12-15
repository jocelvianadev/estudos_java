package primeiro_projeto;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual o número? ");
		int num = scan.nextInt();
		
		for(int i = 1; i <= 8600; i++) {
			System.out.println( num + " x " + i + " = " + (num * i));
		}
		
		
		scan.close();
	}

}
