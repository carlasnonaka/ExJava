package PROVA;

import java.util.Scanner;

public class marcadeautomovel {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Informe o número da marca de automóvel: ");
		int marca = in.nextInt();
		
		switch (marca) {
		case 1:
			System.out.println("Chevrolet");
			break;
		case 2:
			System.out.println("Volkswagen");
			break;
		case 3:
			System.out.println("Fiat");
			break;
		case 4: 
			System.out.println("Honda");
			break;
		default:
			System.out.println("Marca desconhecida!");
		}
		in.close();
	}

}
