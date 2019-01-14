package programas;

import java.util.Scanner;

public class For_Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número desejado: ");
		int n = sc.nextInt();		
		
		for (int i = 1; i <= 10; i++) {
			int produto = i * n;			
			System.out.println(i + " x " + n + " = " + produto);
		}
		
		
		sc.close();
	}
}
