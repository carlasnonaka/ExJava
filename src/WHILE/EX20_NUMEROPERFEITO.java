package WHILE;

import java.util.Scanner;

public class EX20_NUMEROPERFEITO {

	public static void main(String[] args) {

		int n, i, div, somadiv, j;

		Scanner in = new Scanner(System.in);
		System.out.print("Digite um n�mero inteiro positivo: ");
		n = in.nextInt();
		in.close();

		System.out.print("Os n�meros perfeitos entre " + 1 + " a " + n + " s�o: ");
		for (j = 1; j <= n; j++) {
			somadiv = 0;
			i = 1;
			while (i < j) {
				div = j % i;
				if (div == 0) {
					somadiv += i;
				}
				i++;
			}
			if (somadiv == j) {
				System.out.print(j + " ");
			}
		}
	}
}
