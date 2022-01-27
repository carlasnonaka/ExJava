package primeiro;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int raio, altura;
		double volume;
		
		System.out.print(" Digite o raio e a altura: ");
		raio = in.nextInt();
		altura = in.nextInt();
		in.close();
		
		volume = (Math.PI * Math.pow(raio, 2) * altura) / 3;
		
		System.out.printf(" O volume do cone com raio %d e altura %d será de %.2f\n", raio, altura, volume);
		
		

	}

}
