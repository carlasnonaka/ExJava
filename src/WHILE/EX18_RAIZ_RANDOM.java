package WHILE;

import java.util.Random;
import java.util.Scanner;

/* Escreva um programa para calcular a raiz quadrada de um n�mero real x, de acordo com o
 * seguinte algoritmo:
 * i) Comece com um palpite chamado p (p n�o � um dado de entrada, deve ser gerado pelo
 * programa);
 * ii) Se a diferen�a entre p*p e x for menor que 0.0001, pare e diga que p � a resposta;
 * iii) Caso contr�rio, gere um novo palpite calculando a m�dia de p e x/p;
 * iv) Usando o novo palpite, repita o processo a partir do passo ii). */

public class EX18_RAIZ_RANDOM {

	public static void main(String[] args) {
		double x, p;
		
		Scanner in = new Scanner (System.in);
		System.out.print("Digite um n�mero: ");
		x = in.nextDouble();
		
		Random random = new Random();
		p = random.nextInt(100);
		
		while (Math.abs(p*p-x)>=0.0001) {
			p = (p+x/p)/2;
		}
		System.out.printf("A raiz quadrada de %.2f � %.2f.\n",x, p);
		in.close();
		}	
	}

