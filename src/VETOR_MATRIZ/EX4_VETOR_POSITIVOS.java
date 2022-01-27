package VETOR_MATRIZ;

import java.util.Scanner;

/*
 * Desenvolva um programa para armazenar n n�meros inteiros em um vetor e depois
 * imprimir todos os n�meros positivos digitados.
 */

public class EX4_VETOR_POSITIVOS {

	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);
		System.out.print(" Digite a quantidade de n�meros no vetor: ");
		int n = in.nextInt();
		int vetor[] = new int [n];
		
		System.out.printf(" Digite os %d n�meros do vetor: ", n);
		for (int i = 0 ; i<n ; i++) {
		vetor [i] = in.nextInt();
		}
		
		System.out.print(" Os n�meros positivos s�o: ");
		for (int x: vetor) {
			if (x>0) {
			System.out.print(x + " ");
			}
		}
		in.close();
	}

}
