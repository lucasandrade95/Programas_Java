package programas;

import java.util.Locale;
import java.util.Scanner;

public class Exemplos {

	public static void main(String[] args) { // ponto de entrada de uma aplica��o
		
		char gender = 'M';
		int age = 23;
		double balance = 10.35784;
		String name = "Lucas";
		
		double n1 = 10;
		double n2 = 30;
		String s = "ABC";
		
		System.out.println("Esse � um teste burr�o");
		System.out.println("------------------------");
		System.out.println("Ol�, meu nome �: \n" + name + ", tenho "+ age + " anos" + "e sou do sexo: "+ gender);
		System.out.printf("%.3f\n", balance);
		Locale.setDefault(Locale.US);
		System.out.printf("%3f", balance);
		
		
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);
		
		System.out.println("------------------------");
		
		n1 *= 2;
		n2 += n1;
		s += "DEF";
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual � o maior n�mero?");
		//int n1 = sc.nextInt();
	//	int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("O maior n�mero �: " + n1);
		}
		else if (n2 > n3 && n2 > n3) {
			System.out.println("O maior n�mero �: " + n3);
		}
		else {
			System.out.println("O maior n�mero �: " + n3);
		}
		sc.close();
		
		
	}

}
