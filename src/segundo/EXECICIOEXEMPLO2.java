package segundo;

import java.util.Scanner;

public class EXECICIOEXEMPLO2 {

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			double SM, VALOR;
			System.out.print(" Digite o salário médio: ");
			SM= in.nextDouble();
			in.close();
			
			if (SM>5000){
				VALOR = 2*SM;
			}
			else 
			if (SM>3000){
				VALOR = 1.5*SM;
			}
			else
				if (SM>1000) {
					VALOR = SM;
				}
				else {
					VALOR = 0.75*SM;		
					}
			System.out.printf(" VALOR DO CRÉDITO: R$ %.2f ", VALOR);
			}
		}