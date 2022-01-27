package PARA;

import java.util.Scanner;

public class EX11_DIVISAOINTEIRA {

	public static void main(String[] args) {
		int X, Y, quociente = 0;
		
		Scanner in = new Scanner (System.in);
		System.out.print("Digite dividendo e o divisor: ");
		X = in.nextInt();
		Y = in.nextInt();
		in.close();

		for (int i = X; i>=Y; i-=Y) {
			
			quociente++;
		}
		System.out.println("Quociente inteiro da divisão: "+ quociente);
	}

}
