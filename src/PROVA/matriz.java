package PROVA;

/*Escreva uma programa em Java que receba como dados de entrada dois números inteiros, n e m, 
 * o número de linhas e colunas de uma matriz, respectivamente. Depois o programa deve gerar 
 * a matriz de inteiros com valores aleatórios (use a classe Random) no intervalo entre 0 e n * m * 10. 
 * Na sequência o programa deve imprimir o conteúdo da matriz gerada, a média dos elementos da matriz e 
 * quantos elementos da matriz são maiores do que essa média.
 */

import java.util.Scanner;
import java.util.Random;

public class matriz {

	public static void main(String[] args) {
		int elementos = 0;
		float soma = 0;

		Scanner in = new Scanner(System.in);
		System.out.println("Digite o número de linhas:");
		int n = in.nextInt();
		System.out.println("Digite o número de colunas:");
		int m = in.nextInt();

		int[][] matriz = new int[n][m];

		System.out.println("A matriz gerada: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				Random random = new Random();
				matriz[i][j] = random.nextInt(n * m * 10);
				System.out.printf("%d\t", matriz[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				soma += matriz[i][j];
			}
		}
		System.out.printf(" A média dos elementos da matriz é %.2f.\n", soma / (n * m));

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (matriz[i][j] > soma / (n * m)) {
					elementos += 1;
				}
			}
		}
		System.out.printf("A quantidade de elementos maiores são %d.\n", elementos);
		in.close();
	}

}
		