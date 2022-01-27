package segundo;

import java.util.Scanner;

public class EX19_IMC {

	public static void main(String[] args) {
		double peso, altura, imc;
		
		Scanner in = new Scanner (System.in);
		System.out.print("Digite o peso (Kg) e a altura (metros): ");
		peso = in.nextDouble();
		altura = in.nextDouble();
		in.close();
		
		imc = peso / (Math.pow(altura,2));
		
		if (imc<20) {
			System.out.print("Abaixo do peso");
		} else if (imc<=25) {
			System.out.print("Normal");
		} else if (imc<=30) {
			System.out.print("Excesso de peso");
		} else if (imc<=35) {
			System.out.print("Obesidade");
		} else {
			System.out.print("Obesidade mórbida");
		}	}

}
