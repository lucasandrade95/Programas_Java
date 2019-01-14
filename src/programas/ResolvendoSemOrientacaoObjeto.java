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
		
		System.out.println("A área do triângulo X é: " + areaX);
		
		System.out.println("Entre com os valores do triangulo Y: ");
		double a1 = sc.nextDouble();
		double b1 = sc.nextDouble();
		double c1 = sc.nextDouble();
		
		double p1 = (a1 + b1 + c1) / 2;
		
		double areaY = Math.sqrt(p1 * (p1-a1)*(p1-b1)*(p1-c1));
		
		System.out.println("A área do triângulo Y é: " + areaY);
		
		if(areaX > areaY) {
			System.out.println("O triângulo X é o maior!");
		} else {
			System.out.println("O triângulo Y é o maior!");
		}
		
		sc.close();
		
	}
}