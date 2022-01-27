package primeiro;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float n1, n2, media;
		
		System.out.print (" Digite as  duas notas do aluno: ");
		n1 = in.nextFloat();
		n2 = in.nextFloat();
		in.close();
		
		media = (n1+n2) / 2;
		
		System.out.println(" A média aritmética de " + n1 + " e " + n2 + " é " + media);
		
	}

}
