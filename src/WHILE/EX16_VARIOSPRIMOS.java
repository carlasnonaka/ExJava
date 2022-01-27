package WHILE;

import java.util.Scanner;

public class EX16_VARIOSPRIMOS {

	public static void main(String[] args) {
		int p, cont, i, n = 1;

		Scanner in = new Scanner(System.in);
		System.out.print("Digite um número: ");
		p = in.nextInt();
		in.close();

		System.out.printf("Os números primos menores ou iguais a %d são: ", p);

		while (n <= p) {
			cont = 0;
			i = 1;
			while (i <= n) {
				if (n % i == 0) {
					i++;
					cont++;
				} else {
					i++;
				}
			}
			if (cont == 2) {
				System.out.print(n + " ");
				n++;
			} else {
				n++;
			}

		}

	}
}