package PARA;

import java.util.Scanner;

public class EX8_POTENCIASEMPOW {

	public static void main(String[] args) {
		int n, k, resul = 1;

		Scanner in = new Scanner(System.in);
		System.out.print("Digite um n�mero e sua constante: ");
		n = in.nextInt();
		k = in.nextInt();
		in.close();

		resul = n;

		for (int i = 1; i < k; i++) {
			resul *= n;

		}

		System.out.print(" A pot�ncia de " + n + " elevado a " + k + " � " + resul + ".");
	}

}
