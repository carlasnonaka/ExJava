package VETOR_MATRIZ;

/* Criar um programa que receba a temperatura média de cada mês do ano, em graus
 * centígrados, e armazene essas temperaturas em um vetor. Imprimir as temperaturas de
 * todos os meses, maior e a menor temperatura do ano e em que mês aconteceram. Suponha
 * que não há meses com temperaturas iguais.
		*/
import java.util.Scanner;

public class EX7_TEMPERATURA {

	public static void main(String[] args) {
		int[] temp_mes = new int[12];
		int maior = 0, menor = 0;

		Scanner in = new Scanner(System.in);
		System.out.print("Digite a tempertura média de cada mês do ano: ");
		for (int i = 0; i < 12; i++) {
			temp_mes[i] = in.nextInt();
		
		if (temp_mes[maior]<temp_mes[i]) {
			maior = i;
		} else if (temp_mes[menor] > temp_mes[i]) {
			menor = i;
		}
		}
		for (int i = 0; i<12; i++) {
		System.out.printf("A temperatura média do mês %d foi %d °C.\n", (i + 1), temp_mes[i]);
		}
		in.close();
		System.out.printf("A maior temperatura foi no mês %d com %d °C.\n", maior+1, temp_mes[maior]);
		System.out.printf("A menor temperatura foi no mês %d com %d °C.\n", menor+1, temp_mes[menor]);
	}

}
