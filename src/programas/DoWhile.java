package programas;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		char resp;
		do {
			System.out.println("Entre com um número: ");
			double n = sc.nextDouble();
			double sq = Math.sqrt(n);
			System.out.printf("A raiz quadrada é = %.3f\n", sq);
			
			System.out.println("Repetir? (S/N)");
			resp = sc.next().charAt(0);
		
		} while(resp != 'n');
		
		sc.close();
	}
}