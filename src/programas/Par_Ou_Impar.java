package programas;

import java.util.Scanner;

public class Par_Ou_Impar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int a = sc.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("O número é par!");
		}else {
			System.out.println("O número é ímpar!");
		}
		
	    sc.close();
	}

}
