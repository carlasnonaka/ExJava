package PARA;

import java.util.Scanner;

public class EX12_FATORIAL {

	public static void main(String[] args) {
		int n, fat = 1;
		
		Scanner in = new Scanner (System.in);
		System.out.print("Digite um n�mero: ");
		n = in.nextInt();
		in.close();
		
		for (int i=n; i>0; i--) {
			fat *= i;
		}
		System.out.println("O fatorial de "+ n + " � " + fat+".");
	}

}
