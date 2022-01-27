package STRING;

import java.util.Scanner;

public class EX1_AOCONTRARIO {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.print("Digite um nome: ");
		String str = in.nextLine();
		
		for (int i = str.length()-1 ; i >= 0; i--) {
		System.out.print(str.charAt(i));
		}
		in.close();
	}

}
