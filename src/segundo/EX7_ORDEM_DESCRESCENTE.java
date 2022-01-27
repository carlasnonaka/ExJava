package segundo;

import java.util.Scanner;

public class EX7_ORDEM_DESCRESCENTE {

	public static void main(String[] args) {
		int n1, n2;

		Scanner in = new Scanner (System.in);
		System.out.print(" Digite dois números diferentes: ");
		n1 = in.nextInt();
		n2 = in.nextInt();
		in.close();

		if (n1>n2) {
			System.out.printf("%d, %d", n1, n2);
		} else {
			System.out.printf("%d, %d", n2, n1);
		}

	}

}
