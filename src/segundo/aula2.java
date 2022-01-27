package segundo;

import java.util.Scanner;

public class aula2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double n1, n2, media;
		
		System.out.print(" Entre com o valor das 2 provas: ");
		n1= in.nextDouble();
		n2= in.nextDouble();
		in.close();
		
		media = (n1+n2)/2;
		
		if (media>=6){
			System.out.printf(" APROVADO ");
		} 
		else {
			System.out.printf(" REPROVADO ");
		}
		
	}

}
