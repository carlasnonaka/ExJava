package segundo;

import java.util.Scanner;

public class EX8_CONTADOR {
	public static void main(String[] args) {
		int n1, n2, n3, contador;

		Scanner in = new Scanner (System.in);
		System.out.print("Digite 3 números: ");
		n1 = in.nextInt();
		n2 = in.nextInt();
		n3 = in.nextInt();
		in.close();

		contador = 0;

		if (n1<0) {
			contador =  contador + 1;
			if (n2<0) {
				contador =  contador + 1;
			}
			if (n3<0) {
				contador =  contador + 1;
			}
		} else if (n2<0) {
			contador =  contador + 1;
			if (n3<0) {
				contador =  contador + 1;
			}
		}
		else if (n3<0) {
			contador =  contador + 1;
		}

		System.out.printf("Quantos são negativos: %d", contador);
	} 	
}
