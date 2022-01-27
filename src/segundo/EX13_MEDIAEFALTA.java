package segundo;

import java.util.Scanner;

public class EX13_MEDIAEFALTA {

	public static void main(String[] args) {
		double P1, P2, P3, media, total_aula, falta, calculo_falta;
		
		Scanner in = new Scanner (System.in);
		System.out.print("Digite a nota das 3 provas: ");
		P1 = in.nextDouble();
		P2 = in.nextDouble();
		P3 = in.nextDouble();
		System.out.print("Digite o total das aulas ministradas e o número de faltas do aluno: ");
		total_aula = in.nextDouble();
		falta = in.nextDouble();
		in.close();
		
		media = (P1+P2+P3) / 3;
		
		calculo_falta = 0.25*total_aula;
		
		if (media>=7 && falta<=calculo_falta) {
			System.out.print("APROVADO");
		} else if (media>=3 && falta<=calculo_falta) {
			System.out.print("EXAME");
		} else {
			System.out.print("REPROVADO");
		}
		

	}

}
