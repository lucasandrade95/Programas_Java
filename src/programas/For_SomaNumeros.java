package programas;

import java.util.Scanner;

public class For_SomaNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite quantos n�meros deseja efetuar a soma: ");
		int n = sc.nextInt();
		
		
		int soma = 0;
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Valor #" + i + ": ");
			int x = sc.nextInt();
			soma += x;
		}
		
			System.out.println("A soma �: " + soma);
		sc.close();
	}
}