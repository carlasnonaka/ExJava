package PARA;

import java.util.Scanner;

public class EX7_LIMITE {

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o número limite:");
		n = in.nextInt();

		for (int i = 2; i < n; i += 2) {
			System.out.print(i + (i == n - 2 ? "." : ", "));
		}
		in.close();
	}

}
