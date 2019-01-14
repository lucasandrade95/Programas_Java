package programas;

import java.util.Scanner;

public class SenhaValida {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha: ");
		int n = sc.nextInt();
		
		while (n != 2002) {
			System.out.println("Senha inválida!");
			n = sc.nextInt();
		}
			System.out.println("Acesso Permitido!");
		sc.close();
	}

}
