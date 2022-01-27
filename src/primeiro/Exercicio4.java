package primeiro;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		double gasto, gorjeta;
		
		System.out.print(" Qual o valor total do gasto? R$ ");
		gasto = valor.nextFloat();
		valor.close();
		
		gorjeta = (0.10 * gasto);
		
		System.out.printf(" Como o valor total foi R$ %.2f, o valor da gorjeta será R$ %.2f.", gasto, gorjeta);

	}

}
