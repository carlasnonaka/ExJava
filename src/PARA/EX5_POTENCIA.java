package PARA;

import java.util.Scanner;

public class EX5_POTENCIA {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double n, pot;

		for (int i = 0; i < 10; i++) {

			System.out.println("Digite um n�mero: ");
			n = in.nextDouble();

			pot = Math.pow(n, 2);

			System.out.printf(" A pot�ncia de %.2f � %.2f\n", n, pot);
		}
		in.close();
	}

}
