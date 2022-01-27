package primeiro;

import java.util.Scanner;

public class URI1006 {
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		double A, B, C, MEDIA;
		
		System.out.print("");
		A = in.nextDouble();
		B = in.nextDouble();
		C = in.nextDouble();
		in.close();
		
		MEDIA = (2*A+3*B+5*C)/10;
		
		System.out.printf("MEDIA = %.1f\n",MEDIA);
	}

}
