package WHILE;

import java.util.Scanner;

public class EX19_MDC {

	public static void main(String[] args) {
		int n1, n2, resto;

		Scanner in = new Scanner(System.in);
		System.out.print("Digite dois n�meros inteiros positivos: ");
		n1 = in.nextInt();
		n2 = in.nextInt();
		in.close();
		
		System.out.print("O m�ximo divisor comum (MDC) de " + n1 + " e " + n2 + " �: ");
		
		do {
			resto = n1 % n2;
			n1 = n2;
			n2 = resto;
		} while (resto>0);
		System.out.print(n1);

	}
}