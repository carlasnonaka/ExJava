package VETOR_MATRIZ;

/*
 * Criar um programa que leia o preço de compra e o preço de venda de n mercadorias
 * usando um vetor para cada um dos preços. O programa deverá imprimir quantas
 * mercadorias proporcionam:
 * a) Lucro < 10%
 * b) 10 % <= Lucro <= 20%
 * c) Lucro > 20%
 * */
import java.util.Scanner;

public class EX5_LUCRO {

	public static void main(String[] args) {
		int n, merc20 = 0, merc10 = 0, merc1020 = 0;
		float lucro;

		Scanner in = new Scanner(System.in);
		System.out.print("Digite a quantidade de mercadoria: ");
		n = in.nextInt();
		float[] compra = new float[n];
		float[] venda = new float[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Digite o valor de compra e o valor de venda da %d º mercadoria: ", i+1);
			compra[i] = in.nextFloat();
			venda[i] = in.nextFloat();

			lucro = venda[i] - compra[i];

			if (lucro > 0.2 * compra[i]) {
				merc20 += 1;
			} else if (lucro >= 0.1 * compra[i]) {
				merc1020 += 1;
			} else {
				merc10 += 1;
			}
		}

		System.out.println("a) Lucro < 10% : "+ merc10);
		System.out.println("b) 10 % <= Lucro <= 20% : "+ merc1020);
		System.out.println("c) Lucro > 20% : "+ merc20);
		in.close();

	}

}
