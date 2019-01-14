package programas;

import java.util.Locale;
import java.util.Scanner;

public class ResolvendoSemOrientacaoObjeto {
		
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		System.out.println("Entre com os valores do triangulo X: ");
		
		Scanner sc = new Scanner(System.in); 
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double p = (a + b + c) / 2;
		
		double areaX = Math.sqrt(p * (p-a)*(p-b)*(p-c));
		
		System.out.println("A �rea do tri�ngulo X �: " + areaX);
		
		System.out.println("Entre com os valores do triangulo Y: ");
		double a1 = sc.nextDouble();
		double b1 = sc.nextDouble();
		double c1 = sc.nextDouble();
		
		double p1 = (a1 + b1 + c1) / 2;
		
		double areaY = Math.sqrt(p1 * (p1-a1)*(p1-b1)*(p1-c1));
		
		System.out.println("A �rea do tri�ngulo Y �: " + areaY);
		
		if(areaX > areaY) {
			System.out.println("O tri�ngulo X � o maior!");
		} else {
			System.out.println("O tri�ngulo Y � o maior!");
		}
		
		sc.close();
		
	}
}