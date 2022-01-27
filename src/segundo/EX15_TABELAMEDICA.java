package segundo;

import java.util.Scanner;

public class EX15_TABELAMEDICA {

	public static void main(String[] args) {
		float altura, peso;
		char sexo;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a altura em metros: ");
		altura = in.nextFloat();
		in.nextLine();
		System.out.println("Digite o M para masculino e F para feminino ");
		sexo = in.nextLine().charAt(0);
		in.close();
		
		peso = (sexo == 'M' || sexo == 'm' ?  72.7f * altura - 58 : 62.1f * altura- 44.7f );

		System.out.printf ("O peso ideal é %.2f.", peso);
		
		
	}

}
