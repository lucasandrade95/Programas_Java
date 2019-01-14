package programas;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite 3 números: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a > b && a > c ) {
			System.out.println("O maior número é: "+ a );
		} else if(b >c && b > a) {
			System.out.println("O maior número é: "+ b);
		} else {
			System.out.println("O maior número é: "+ c);
		}
		
		
		sc.close();
	}
}
