package enumeracao;

import java.util.Scanner;

public class mAIN2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DiaSemana d = null;
		
		System.out.print("Informe um número de 1 a 7: ");
		int num = scan.nextInt();
		
		switch (num) {
		case 1: 
			d = DiaSemana.DOMINGO;
			break;
		
		case 2:
			d = DiaSemana.SEGUNDA;
			break;
			
		case 3:
			d = DiaSemana.TERCA;
			break;
			
		case 4:
			d = DiaSemana.QUARTA;
			break;
			
		case 5:
			d = DiaSemana.QUINTA;
			break;
			
		case 6:
			d = DiaSemana.SEXTA;
			break;
			
		case 7:
			d = DiaSemana.SABADO;
			break;
			
		default:
			System.out.println("Opção inválida!");
			break;
			
		}
		if(num <= 7){
			System.out.println("Hoje é " + d);
		}else {			
			System.out.println("Fim do programa");
		}
		scan.close();
	}

}
