package WHILE;

import java.util.Scanner;

/*
 * Desenvolva um programa em Java que dado um número natural na base decimal, transformá-lo
 * para a base binária. Exemplo: Dado 18 a saída deverá ser 10010.
 */

public class EX25_DECIMALPARABINARIO {

	public static void main(String[] args) {
		int dec, e=0;
		double bin = 0;
		
		Scanner in = new Scanner (System.in);
		System.out.print("Digite um número: ");
		dec = in.nextInt();
		
		System.out.printf("O número binário da base decimal %d é",dec);
		while (dec>0) {
			bin += (dec%2) * Math.pow(10,e);
			e += 1;
			dec /= 2;
		}
		System.out.printf(" %.0f. ",bin);
		in.close();
		}
		

	}
