package PROVA;

/*Escreva uma programa em Java que receba como dados de entrada dois n�meros inteiros, n e m, 
 * o n�mero de linhas e colunas de uma matriz, respectivamente. Depois o programa deve gerar 
 * a matriz de inteiros com valores aleat�rios (use a classe Random) no intervalo entre 0 e n * m * 10. 
 * Na sequ�ncia o programa deve imprimir o conte�do da matriz gerada, a m�dia dos elementos da matriz e 
 * quantos elementos da matriz s�o maiores do que essa m�dia.
 */

import java.util.Scanner;
import java.util.Random;

public class matriz {

	public static void main(String[] args) {
		int elementos = 0;
		float soma = 0;

		Scanner in = new Scanner(System.in);
		System.out.println("Digite o n�mero de linhas:");
		int n = in.nextInt();
		System.out.println("Digite o n�mero de colunas:");
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
		System.out.printf(" A m�dia dos elementos da matriz � %.2f.\n", soma / (n * m));

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (matriz[i][j] > soma / (n * m)) {
					elementos += 1;
				}
			}
		}
		System.out.printf("A quantidade de elementos maiores s�o %d.\n", elementos);
		in.close();
	}

}
		