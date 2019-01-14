package programas;

import java.util.Scanner;

public class Duracao_Jogo{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas horas você jogou?");
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println(+ duracao + " HORA(S) VOCÊ FICOU JOGANDO");
		
		sc.close();
	}
}