package programas;

import java.util.Locale;
import java.util.Scanner;

public class While_RaizQuadrada {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero para saber sua raiz quadrada: ");
		double n = sc.nextDouble();
		
		while(n >= 0.0) {
			double sr = Math.sqrt(n);
			System.out.printf("Sua raiz quadrada �: %.3f\n", sr);
			System.out.print("Digite outro n�mero: ");
			n = sc.nextDouble();
		}
			System.out.println("Voc� digitou um n�mero negativo. Tente novamente!");
		
		sc.close();
	}

}
