package programas;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o número da semana: ");
		
		int x = sc.nextInt();
		String dia;
		
		switch(x) {
		case 1:
			dia = "Segunda";
		break;
		case 2:
			dia = "Terça";
		break;
		case 3:
			dia = "Quarta";
		break;
		case 4:
			dia = "Quinta";
		break;
		case 5:
			dia = "Sexta";
		break;
		case 6:
			dia = "Sábado";
		break;
		case 7:
			dia = "Domingo";
		break;
		default:
			dia = "O dia da semana é inválido!";
		}
		
		System.out.println("O dia da semana é: " + dia);
		
		
		
		sc.close();
	}
}

