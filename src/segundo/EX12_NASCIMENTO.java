package segundo;

import java.util.Scanner;

public class EX12_NASCIMENTO {
	public static void main(String[] args) {
		int dia_nas, mes_nas, ano_nas, dia_atu, mes_atu, ano_atu, idade;

		Scanner in = new Scanner(System.in);
		System.out.print("Digite o dia, mês e ano do seu nascimento: ");
		dia_nas = in.nextInt();
		mes_nas = in.nextInt();
		ano_nas = in.nextInt();
		System.out.print("Digite o dia, mês e ano da data atual: ");
		dia_atu = in.nextInt();
		mes_atu = in.nextInt();
		ano_atu = in.nextInt();
		in.close();

		idade = ano_atu - ano_nas;

		if (mes_atu < mes_nas || (mes_atu == mes_nas && dia_atu < dia_nas)) {
			idade = idade - 1;
		}
		System.out.printf("Sua idade é %d anos.", idade);
	}
}
