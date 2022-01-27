package segundo;

import java.util.Scanner;

public class aula2_exercicio1 {

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int x;
			System.out.print(" valor de x ");
			x= in.nextInt();
			in.close();
			
			if (x <= 200) {
				if (x < 100) {
				if (x < 0) {
				System.out.println("A");
				} else {
				System.out.println("B");
				}
				} else {
				System.out.println("C");
				}
				} else {
				System.out.println("D");
				}
}
}