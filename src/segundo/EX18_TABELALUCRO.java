package segundo;

import java.util.Scanner;

public class EX18_TABELALUCRO {

	public static void main(String[] args) {
		double valor_compra, valor_venda;
		
		Scanner in = new Scanner (System.in);
		System.out.print("Digite o valor da compra: ");
		valor_compra = in.nextDouble();
		in.close();
		
		if (valor_compra>=50){
			valor_venda = 1.30*valor_compra;
			} else if (valor_compra>=30) {
				valor_venda = 1.40*valor_compra;
			} else if (valor_compra>=10) {
				valor_venda = 1.50*valor_compra;
			} else {
				valor_venda = 1.70*valor_compra;
			}
		System.out.printf(" O valor da venda será R$ %.2f", valor_venda);

	}

}
