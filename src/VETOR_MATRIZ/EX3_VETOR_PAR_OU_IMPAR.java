package VETOR_MATRIZ;

/*
 * Desenvolva um programa para armazenar 10 números inteiros em um vetor e imprimir
 * uma listagem numerada contendo o número e umas das mensagens: par ou ímpar, para
 * cada elemento do vetor.
 */

import java.util.Scanner;

public class EX3_VETOR_PAR_OU_IMPAR {

	public static void main(String[] args) {
		int num[] = new int[10];

		Scanner in = new Scanner(System.in);
		System.out.print("Digite um conjunto de 10 números: ");

		for (int i = 0; i < 10; i++) {
			num[i] = in.nextInt();
			System.out.println(i+1 +"°) "+num[i] + ((num[i] % 2 == 0) ? " PAR" : " IMPAR"));
		}
		in.close();
	}

}



