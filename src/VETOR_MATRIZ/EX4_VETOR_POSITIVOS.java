package VETOR_MATRIZ;

import java.util.Scanner;

/*
 * Desenvolva um programa para armazenar n números inteiros em um vetor e depois
 * imprimir todos os números positivos digitados.
 */

public class EX4_VETOR_POSITIVOS {

	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);
		System.out.print(" Digite a quantidade de números no vetor: ");
		int n = in.nextInt();
		int vetor[] = new int [n];
		
		System.out.printf(" Digite os %d números do vetor: ", n);
		for (int i = 0 ; i<n ; i++) {
		vetor [i] = in.nextInt();
		}
		
		System.out.print(" Os números positivos são: ");
		for (int x: vetor) {
			if (x>0) {
			System.out.print(x + " ");
			}
		}
		in.close();
	}

}
