package WHILE;

import java.util.Scanner;

public class EX15_PRIMO {

	public static void main(String[] args) {
		int p, cont = 0, i = 1;

		Scanner in = new Scanner(System.in);
		System.out.print("Digite um número: ");
		p = in.nextInt();
		in.close();

		while (i <= p) {
			if (p % i == 0) {
				i++;
				cont++;
			} else {
				i++;
			}
		}
		System.out.print((cont == 2) ? (p + " é um número primo.") : (p + " não é um número primo."));
	}
}
