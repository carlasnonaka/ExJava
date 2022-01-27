package PARA;

import java.util.Scanner;

public class EX10_IMPAR {
	
	public static void main(String[] args) {
		float result;
		Scanner in = new Scanner(System.in);
		int num;

		System.out.print("Digite um número: ");
		num = in.nextInt();

		System.out.print(num + " primeiros numeros impares em ordem decrescente: ");
		for (int i=num; i>=1; i-=2) {
			result = (i % 2 == 0 ? (result = i-1) : (result = i));
			System.out.printf(" %.0f ",result);
		}
		in.close();
	}

}