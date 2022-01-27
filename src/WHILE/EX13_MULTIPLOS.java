package WHILE;

import java.util.Scanner;

public class EX13_MULTIPLOS {

	public static void main(String[] args) {

		int n, i, j, cont = 0, mult = 0;

		Scanner in = new Scanner(System.in);
		System.out.println("Digite três números naturais diferente de 0:");
		n = in.nextInt();
		i = in.nextInt();
		j = in.nextInt();
		in.close();

		while (cont < n) {
			if (mult % i == 0 || mult % j == 0) {
				System.out.print(mult);
				mult++;
				cont++;
				System.out.print((cont < n) ? (", ") : ("."));
			} else {
				mult++;
			}
		}
	}
}
