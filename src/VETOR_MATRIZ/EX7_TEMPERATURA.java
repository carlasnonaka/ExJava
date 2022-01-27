package VETOR_MATRIZ;

/* Criar um programa que receba a temperatura m�dia de cada m�s do ano, em graus
 * cent�grados, e armazene essas temperaturas em um vetor. Imprimir as temperaturas de
 * todos os meses, maior e a menor temperatura do ano e em que m�s aconteceram. Suponha
 * que n�o h� meses com temperaturas iguais.
		*/
import java.util.Scanner;

public class EX7_TEMPERATURA {

	public static void main(String[] args) {
		int[] temp_mes = new int[12];
		int maior = 0, menor = 0;

		Scanner in = new Scanner(System.in);
		System.out.print("Digite a tempertura m�dia de cada m�s do ano: ");
		for (int i = 0; i < 12; i++) {
			temp_mes[i] = in.nextInt();
		
		if (temp_mes[maior]<temp_mes[i]) {
			maior = i;
		} else if (temp_mes[menor] > temp_mes[i]) {
			menor = i;
		}
		}
		for (int i = 0; i<12; i++) {
		System.out.printf("A temperatura m�dia do m�s %d foi %d �C.\n", (i + 1), temp_mes[i]);
		}
		in.close();
		System.out.printf("A maior temperatura foi no m�s %d com %d �C.\n", maior+1, temp_mes[maior]);
		System.out.printf("A menor temperatura foi no m�s %d com %d �C.\n", menor+1, temp_mes[menor]);
	}

}
