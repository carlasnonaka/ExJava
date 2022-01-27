package VETOR_MATRIZ;

import java.util.Scanner;

/*Criar um programa para entrar com números inteiros em um vetor a de tamanho 10. Gerar
 * e imprimir o vetor b onde cada elemento é o quadrado do elemento, na respectiva posição do vetor a.
 */

public class EX6_QUADRADO_VETOR {

	public static void main(String[] args) {
		int[] b = new int[10];
		int[] a = new int[10];
		int j = 0;

		Scanner in = new Scanner(System.in);
		System.out.print("Digite os 10 números dos vetores a: ");
		for (int i = 0; i < 10; i++) {
			a[i] = in.nextInt();
		}
		in.close();
		for (j = 0; j < 10; j++) {
			b[j] = a[j] * a[j];
			System.out.println("Posição " + (j + 1) + "°: " + b[j] + " ");
		}

	}
}

