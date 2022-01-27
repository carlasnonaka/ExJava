package WHILE;

import java.util.Scanner;

public class EX17_MASSA {

	public static void main(String[] args) {

		double m;
		int tempo = 0, hora, minuto, segundo;

		Scanner in = new Scanner(System.in);
		System.out.print("Digite a massa em gramas (g): ");
		m = in.nextInt();
		in.close();

		while (m >= 0.5) {
			m = m * 0.5;
			tempo = tempo + 50;
		}
		hora = tempo / 3600;
		minuto = tempo % 3600 / 60;
		segundo = tempo % 60;
		System.out.printf(
				"Será necessário um tempo de %d hora(s) %d minutos e %d segundos para a massa ficar menor que 0,5 grama.",
				hora, minuto, segundo);
	}
}
