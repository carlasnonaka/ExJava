package STRING;

import java.util.Scanner;

public class EX2_LETRAMAIUSCULA {

	public static void main(String[] args) {

		int maiuscula = 0;

		Scanner in = new Scanner(System.in);
		System.out.print("Digite uma string: ");
		String str = in.nextLine();
		in.close();

		for (int j = 0; j < str.length(); j++)
			if (str.charAt(j) >= 'A' && str.charAt(j) <= 'Z') {
				maiuscula += 1;
			}

		System.out.print(String.format("A string %s possui %d letra(s) maiúscula(s).", str, maiuscula));

	}

}
