package programas;

import java.util.Scanner;

public class Par_Ou_Impar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int a = sc.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("O n�mero � par!");
		}else {
			System.out.println("O n�mero � �mpar!");
		}
		
	    sc.close();
	}

}
