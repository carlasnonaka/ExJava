package segundo;

import java.util.Scanner;

public class EX6_EMPRESTIMO {

	public static void main(String[] args) {
		double sal_bruto, valor_prest, valor_emprest, valor_maximo;
		int parcela;

		Scanner in = new Scanner(System.in);
		System.out.print("Digite o sal�rio bruto: ");
		sal_bruto = in.nextDouble();
		System.out.print("Digite o valor do empr�stimo: ");
		valor_emprest = in.nextDouble();
		System.out.print("Digite o n�mero de parcelas: ");
		parcela = in.nextInt();
		in.close();

		valor_prest = valor_emprest/parcela;
		valor_maximo = 0.3*sal_bruto;

		if (valor_prest<=valor_maximo) {
			System.out.printf("Valor da parcela R$ %.2f\n", valor_prest);
			System.out.print("Empr�stimo concedido");
		} else {
			System.out.print("Empr�stimo n�o pode ser concedido\n");
			System.out.printf("Valor da m�ximo da parcela R$ %.2f\n", valor_maximo);
		}
	}

}
