package WHILE;

import java.util.Scanner;

public class EX14_TRIANGULAR {

	public static void main(String[] args) {

		int n, n1 = 0, ntri = 0;

		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número: ");
		n = in.nextInt();

		while (ntri < n) {
			ntri = n1 * (n1 + 1) * (n1 + 2);
			n1++;
		}

		in.close();
		System.out.println((ntri == n ? (n + " é um número triangular!") : (n + " não é um número triangular!")));
	}
}
