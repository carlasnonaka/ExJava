package PARA;

import java.util.Scanner;

public class EX9_DISCOSVENDIDOS {

	public static void main(String[] args) {
		
		int discos, maior=0, dia=0;
		
		for (int i=1; i<=31; i++) {
			
		Scanner in = new Scanner (System.in);
		System.out.println("Digite a quantidade de discos vendidos no dia " + i + ":");
		discos = in.nextInt();
		in.close();
		
		if (discos>maior) {
		maior = discos;
		dia = i;
		}
	} 
		System.out.printf("O dia que mais vendeu discos foi dia %d com %d discos vendidos.", dia, maior);
		
		}
}
