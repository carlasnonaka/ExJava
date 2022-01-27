package segundo;

import java.util.Scanner;

public class EX10_TRIANGULO {

	public static void main(String[] args) {
		int A, B, C;

		Scanner in = new Scanner (System.in);
		System.out.print("Digite três valores: ");
		A = in.nextInt();
		B = in.nextInt();
		C = in.nextInt();
		in.close();

		if (A<(B+C) && B<(A+C) && C<(B+A)) {
			if (A==B && C==A) {
				System.out.print("Triângulo Equilátero.");
			} else if (A!=B && B!=C && C!=A) {
				System.out.print("Triângulo Escaleno.");
			} else {
				System.out.print("Triângulo Isósceles.");
			}
		} else {
			System.out.print("Não forma um triângulo.");
		}



	}

}
