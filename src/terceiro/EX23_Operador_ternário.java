package terceiro;

import java.util.Scanner;

public class EX23_Operador_ternário {

	public static void main(String[] args) {
		String nome_pessoa;
		char sexo;
		
		Scanner in = new Scanner (System.in);
		System.out.print(" Digite seu nome: ");
		nome_pessoa = in.nextLine();
		System.out.print(" Digite M para masculino e F para feminino ");
		sexo = in.nextLine().charAt(0);
		in.close();
		
		System.out.println ("Muito obrigado, "+(sexo == 'M' || sexo == 'm' ? "Sr." : "Sra.") + nome_pessoa);
		
	}

}
