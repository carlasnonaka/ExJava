package WHILE;

import java.util.Scanner;

public class EX23_RICCI {

	public static void main(String[] args) {
		int R, soma=0;
		
		Scanner in = new Scanner (System.in);
		System.out.print("Digite os dois primeiros termos de Ricci: ");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		System.out.print("Digite os n termos de Ricci que deseja imprirmir maiores que 3: ");
		int n = in.nextInt();
		while (n<=3) {
			System.out.print("Digite os n termos de Ricci que deseja imprirmir maiores que 3: ");
			n = in.nextInt();
		}
		for (int i = 1; i<=n; i++) {
			if (i==1) {
				R = n1;
				System.out.println(" R" + i + " = " + R);
				soma = soma+R;
			} else if (i==2) {
				R = n2;
				System.out.println(" R" + i + " = " + R);
				soma = soma+R;
			} else {
				R = (n1+n2);
				n1 = n2;
				n2 = R;
				System.out.println(" R" + i + " = " + R);
				soma = soma+R;
				
			}
		}		
		
		System.out.print(" A soma dos termos impressos é "+ soma+".");
		System.out.println();
		in.close();
	}

}
