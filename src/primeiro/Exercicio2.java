package primeiro;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner rai = new Scanner (System.in);
		int raio, diametro;
		double area, circunferencia;
		
		System.out.print ("Digite o raio: ");
		raio = rai.nextInt();
		rai.close();
		
		diametro = 2 * raio;
		area = Math.PI * Math.pow(raio,2);
		circunferencia = 2 * Math.PI * raio;
		
		System.out.printf(" O Di�metro � %d\n A �rea � %.2f\n E a circunfer�ncia � %.2f\n", diametro, area, circunferencia);

	}

}
