package segundo;

import java.util.Scanner;

public class EX17_PLANODESAUDE {
	public static void main(String[] args) {
		int idade;

		Scanner in = new Scanner(System.in);
		System.out.print("Digite sua idade: ");
		idade = in.nextInt();
		in.close();

		if (idade>65) {
			System.out.print("DEVERÁ PAGAR R$900,00");
		} else if (idade>50) {
			System.out.print("DEVERÁ PAGAR R$750,00");
		} else if (idade>24) {
			System.out.print("DEVERÁ PAGAR R$500,00");
		} else if (idade>18) {
			System.out.print("DEVERÁ PAGAR R$300,00");
		} else if (idade>10) {
			System.out.print("DEVERÁ PAGAR R$250,00");
		} else {
			System.out.print("DEVERÁ PAGAR R$150,00");
		}


	}

}
