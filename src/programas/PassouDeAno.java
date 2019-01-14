package programas;

import java.util.Scanner;
import java.util.Locale;

public class PassouDeAno {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Uma ao lado da outra. Digite suas notas:");
		
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		
		float resul = (n1 + n2) / 2;
		
		if(resul >= 7 ) {
			System.out.println("Passou de ano miseravi");
		} else {
			System.out.println("Não passou abestado");
		}
		
		sc.close();
	}
}
