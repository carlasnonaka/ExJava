package segundo;

import java.util.Scanner;

public class EX14_VENDAPRODUTO {

	public static void main(String[] args) {
		double produto, venda;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o valor de custo do produto: ");
		produto = in.nextDouble();
		in.close();
		
		if (produto<20) {
			venda = 1.45*produto;
		} else {
			venda = 1.30*produto;
		}
		System.out.printf("O produto será vendido no valor de R$ %.2f", venda);
	}

}
