package primeiro;

import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */
public class URI1003 {
 
    public static void main(String[] args) throws IOException {
        
        Scanner in = new Scanner(System.in);
		int n1, n2, soma;
		
		System.out.print("");
		n1 = in.nextInt();
		n2 = in.nextInt();
		in.close();
		
		soma = n1 + n2;
		
		System.out.printf("SOMA = %d\n",soma);
 
    }
 
}
