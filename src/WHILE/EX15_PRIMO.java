package WHILE;

import java.util.Scanner;

public class EX15_PRIMO {

	public static void main(String[] args) {
		int p, cont = 0, i = 1;

		Scanner in = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
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
		System.out.print((cont == 2) ? (p + " � um n�mero primo.") : (p + " n�o � um n�mero primo."));
	}
}
