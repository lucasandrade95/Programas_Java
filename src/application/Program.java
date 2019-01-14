package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program{
	public static void main (String args[]) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Qual seu nome: ");
		product.name = sc.nextLine();
		
		System.out.println("Qual seu salário bruto: ");
		product.salario = sc.nextDouble();
		
		System.out.println("Qual o valor da taxa (em reais):");
		product.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Empregado: " + product.name + ", Valor líquido: R$" + product.salarioTaxa());
		System.out.println();
		
		System.out.println("Qual a porcentagem para incrementar seu salario: ");
		product.porcent = sc.nextInt();
		
		double valorFinal;
		valorFinal = product.salarioPorcentagem() + product.salarioTaxa();
		
		System.out.println("O seu novo salário é: R$" + valorFinal);
		
		
		
		sc.close();
	}
		
}