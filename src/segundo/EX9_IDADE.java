package segundo;

import java.util.Scanner;

public class EX9_IDADE {

	public static void main(String[] args) {
		int idade;
		
		Scanner in = new Scanner (System.in);
		System.out.print("Digite sua idade: ");
		idade = in.nextInt();
		in.close();
		
		if (idade<16) {
			System.out.print("Não pode votar.");
		} else if (idade<18 || idade>=65){
			System.out.print("Voto Facultativo.");
		} else {
			System.out.print("Voto Obrigatório.");
		}

	}

}
