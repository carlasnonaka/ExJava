package terceiro;

import java.util.Scanner;

public class EX22_CARACTER�STICA {

	public static void main(String[] args) {
		int D, M, A, N, Z;
		String adjetivo = null;
		
		Scanner in = new Scanner (System.in);
		System.out.print ("Digite o dia de nascimento: ");
		D = in.nextInt();
		System.out.print ("Digite o m�s de nascimento: ");
		M = in.nextInt();
		System.out.print ("Digite o ano de nascimento: ");
		A = in.nextInt();
		in.close();
		
		
		N = (D*1000000)+(M*10000)+A;
		
		Z = N % 9;
		
		switch (Z) {
		case 0:
			adjetivo = "Irresist�vel";
			break;
		case 1:
			adjetivo = "Impetuoso";
			break;
		case 2:
			adjetivo = "Discreto";
			break;
		case 3:
			adjetivo = "Amoroso";
			break;
		case 4:
			adjetivo = "T�mido";
			break;
		case 5:
			adjetivo = "Paquerador";
			break;
		case 6:
			adjetivo = "Estudioso";
			break;
		case 7:
			adjetivo = "Sonhador";
			break;
		case 8:
			adjetivo = "Charmoso";
			break;
		}
		System.out.printf ("Sua caracter�stica de acordo com sua data de nascimento �: "+ adjetivo);	
	}

}
