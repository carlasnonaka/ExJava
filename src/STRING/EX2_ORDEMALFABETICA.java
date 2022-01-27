package STRING;

import java.util.Scanner;

public class EX2_ORDEMALFABETICA {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.print ("Digite duas strings: ");
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		in.close();
		
		if (str1.compareToIgnoreCase(str2)<0) {
			System.out.print(String.format("%s, %s", str1, str2));
		} else {
			System.out.print(String.format("%s, %s", str2, str1));
		}

	}

}
