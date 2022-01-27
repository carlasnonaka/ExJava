package metodo;

/* TRABALHO PRÁTICO - VACINAÇÃO 
 * Nomes dos alunos: Alexandre Santos Resende, Ana Paula Martins de Oliveira, Carla Suemi Nonaka. 
 * */

import java.util.Scanner;

public class EX_TRABALHO_PRATICO {

	public static void main(String[] args) {
		//Declaração das variáveis utilizadas no exercício
		int populacao, meses, maior = 0;
		float soma_pri_dose = 0, soma_seg_dose = 0, percentual_pri_dose, percentual_seg_dose;
		
		// Entrada de dados do total de habitantes e da quantidade de meses a serem analisadas
		Scanner in = new Scanner(System.in);
		populacao = in.nextInt();
		meses = in.nextInt();
		
		// Criação dos vetores para os meses referentes a primeira dose, a segunda dose e a soma de cada mes
		int[] pri_dose = new int[meses];
		int[] seg_dose = new int[meses];
		int[] soma_mes = new int[meses];
		
		// Irá ler as primeiras doses na quantidade de meses informado e somar o total de habitantes que tomaram a primeira dose
		for (int i = 0; i < meses; i++) {
			pri_dose[i] = in.nextInt();
			soma_pri_dose += pri_dose[i];
		}
		
		// Irá ler as segunda doses na quantidade de meses informado e somar o total de habitantes que tomaram a segunda dose
		for (int i = 0; i < meses; i++) {
			seg_dose[i] = in.nextInt();
			soma_seg_dose += seg_dose[i];
		}
		
		/*Somará o total de habitantes que tomaram a primeira e a segunda dose em cada mês e verificará qual mês foi o maior
		número de vacinados */
		for (int i = 0; i < meses; i++) {
			soma_mes[i] = pri_dose[i] + seg_dose[i];
			if (soma_mes[i] > maior) {
				maior = i + 1;
			}
		}
		
		// Calculará o percentual de vacinados em relação ao total de habitantes
		percentual_pri_dose = soma_pri_dose / populacao * 100;
		percentual_seg_dose = soma_seg_dose / populacao * 100;
		
		// Exibirá as saídas solicitadas (percentual da primeira dose, percentual da segunda dose, o mês de maior habitantes vacinados
		System.out.printf("%.1f\n", percentual_pri_dose);
		System.out.printf("%.1f\n", percentual_seg_dose);
		System.out.println(maior);

		in.close();

	}

}
