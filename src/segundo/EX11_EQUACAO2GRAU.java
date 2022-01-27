package segundo;

import java.util.Scanner;

public class EX11_EQUACAO2GRAU {

	public static void main(String[] args) {
		double A, B, C, Delta, x1, x2;

		Scanner in = new Scanner(System.in);
		System.out.print("Digite os valores das vari�veis A, B e C: ");
		A = in.nextDouble();
		B = in.nextDouble();
		C = in.nextDouble();
		in.close();

		Delta = (B*B) - (4*A*C);

		x1 = (-B + Math.sqrt(Delta)) / (2*A);
		x2 = (-B - Math.sqrt(Delta)) / (2*A);

		if (Delta>0 && A!=0) {
			System.out.printf("H� duas solu��es reais e diferentes x' = %.2f e x'' = %.2f.", x1, x2);
		} else if (Delta ==0 && A!=0){
			System.out.printf("H� duas solu�oes reais e iguais x' = x'' = %.2f", x1);
		} else {
			System.out.print("N�o h� solu��o real");
		}
	}

}
