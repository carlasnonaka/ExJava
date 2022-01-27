package WHILE;

import java.util.Scanner;

public class EX06_QUADRADO {

	public static void main(String[] args) {
	    int n;

	    Scanner in = new Scanner (System.in);
	    System.out.println("Digite um número: ");
	    n = in.nextInt();

	    while (n != 0) {
	     System.out.println("O quadrado de " + n + " é " + n*n);
	     System.out.println("Digite um número: ");
	     n = in.nextInt();
	    }
	    in.close();
	  }
	}
