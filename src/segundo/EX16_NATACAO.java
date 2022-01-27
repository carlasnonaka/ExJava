package segundo;

import java.util.Scanner;

public class EX16_NATACAO {

	public static void main(String[] args) {
		int idade;

		Scanner in = new Scanner(System.in);
		System.out.print("Digite sua idade: ");
		idade = in.nextInt();
		in.close();

		if (idade>17) {
			System.out.print("ADULTO");
		} else if (idade>=14) {
			System.out.print("JUVENIL B");
		} else if (idade>=11) {
			System.out.print("JUVENIL A");
		} else if (idade>=8) {
			System.out.print("INFANTIL B");
		} else if (idade>=5) {
			System.out.print("INFANTIL A");
		} else {
			System.out.print("SEM CATEGORIA PARA SUA IDADE");
		}


	}

}
