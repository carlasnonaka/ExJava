package segundo;

import java.util.Scanner;

public class EX10_TRIANGULO {

	public static void main(String[] args) {
		int A, B, C;

		Scanner in = new Scanner (System.in);
		System.out.print("Digite tr�s valores: ");
		A = in.nextInt();
		B = in.nextInt();
		C = in.nextInt();
		in.close();

		if (A<(B+C) && B<(A+C) && C<(B+A)) {
			if (A==B && C==A) {
				System.out.print("Tri�ngulo Equil�tero.");
			} else if (A!=B && B!=C && C!=A) {
				System.out.print("Tri�ngulo Escaleno.");
			} else {
				System.out.print("Tri�ngulo Is�sceles.");
			}
		} else {
			System.out.print("N�o forma um tri�ngulo.");
		}



	}

}
