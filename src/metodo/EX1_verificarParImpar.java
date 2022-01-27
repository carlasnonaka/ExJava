package metodo;

import java.util.Scanner;

public class EX1_verificarParImpar {

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner (System.in);
		System.out.print("Digite um número: ");
		n = in.nextInt();
		in.close();
		
		System.out.print("O número "+ n + " é " + (verificarParImpar(n)));
		 
		
	}
	public static boolean verificarParImpar (int n) {
		return n % 2 == 0;
	}

}
