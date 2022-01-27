package WHILE;

import java.util.Scanner;

public class EX22_FIBONACCI {

	public static void main(String[] args) {
		int F=0, F1=1, F2=1;

		Scanner in = new Scanner(System.in);
		System.out.print("Digite o valor de n: ");
		int n = in.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i == 1 || i == 2) {
				F = 1;
			} else {
				F = F1 + F2;
				F1 = F2;
				F2 = F;
				
			}
		}
		System.out.print(" F" + n + " = " + F);
		System.out.println();
		in.close();
	}

}
