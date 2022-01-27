package WHILE;

public class EX21_PI {

	public static void main(String[] args) {
		double div = 0, denominador = 1, pi = 0;
		boolean soma = true;
		
		do {
		
		div = 4/denominador;
		denominador += 2;
		pi += (soma ? div : -div);
		soma = !soma;
		
		} while (div>0.0001);
		
		System.out.printf("PI = %.4f",pi);
	}

}
