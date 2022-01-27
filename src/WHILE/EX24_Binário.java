package WHILE;

/* Desenvolva um programa em Java que dado um número natural na base binária, transformá-lo
 * para a base decimal. Exemplo: dado 10010 a saída será 18, pois 1. 2 4 + 0. 2 3 + 0. 2 2 + 1. 2 1 +
 * 0. 2 0 = 18.*/

import java.util.Scanner;
public class EX24_Binário {

	public static void main(String[] args) {
		int n;
		double dec = 0, e = 0;
		
		Scanner in = new Scanner (System.in);
		System.out.print("Digite o número na base binária: ");
		n = in.nextInt();
		
		System.out.printf("O número decimal da base binária %d é",n);
		while (n>0) {
			dec += (n%10) * Math.pow(2,e);
			e += 1;
			n /= 10;
		}
		System.out.printf(" %.0f. ",dec);
		in.close();
		}	
	}
