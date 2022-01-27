package PROVA;

import java.util.Scanner;

public class PROVA1 {

	public static void main(String[] args) {
		int entrada, saida, tempo;
		
		Scanner in = new Scanner (System.in);
		System.out.print("Digite o horário de entrada e saída: ");
		entrada = in.nextInt();
		saida = in.nextInt();
		
		if (saida<=entrada) { 
			
			saida +=24;
			tempo = saida - entrada;
			System.out.printf("O JOGO DUROU %d HORA(S)\n",tempo);
			
		} else {
			
			tempo = saida - entrada;
			System.out.printf("O JOGO DUROU %d HORA(S)\n",tempo);
		}
		in.close();
	}

}