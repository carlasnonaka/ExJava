package terceiro;

import java.util.Scanner;

public class EX20_DIADASEMANA {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int dia = in.nextInt();
		in.close();
		String diaDaSemana;

		switch (dia) {
		case 1:
			diaDaSemana = "Domingo";
			break;
		case 2:
			diaDaSemana = "Segunda-feira";
			break;
		case 3:
			diaDaSemana = "Terça-feira";
			break;
		case 4:
			diaDaSemana = "Quarta-feira";
			break;
		case 5:
			diaDaSemana = "Quinta-feira";
			break;
		case 6:
			diaDaSemana = "Sexta-feira";
			break;
		case 7:
			diaDaSemana = "Sábado";
			break;
		default:
			diaDaSemana = "Inválido!";

		}
		System.out.println("Dia da semana: " + diaDaSemana);
	}

}
