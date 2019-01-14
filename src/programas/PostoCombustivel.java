package programas;

import java.util.Scanner;

public class PostoCombustivel {

	public static void main(String[] args) {

		
		System.out.println("Digite o tipo de combustível: \n 1-Álcool\n 2-Gasolina\n 3-Diesel\n 4-FIM");
		Scanner sc = new Scanner(System.in);
		
		int alcool   = 0;
		int gasolina = 0;
		int diesel   = 0;
		
		int tipo = sc.nextInt();
		
		while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1;
			}
			else if (tipo == 2) {
				gasolina = gasolina + 1;
			}
			else if (tipo == 3) {
				diesel = diesel + 1;
			}
			
			tipo = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
		
		
		
	}

}
