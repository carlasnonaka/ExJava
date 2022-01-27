package terceiro;

import java.util.Scanner;

public class EX21_DIA_MES_ANO {

	public static void main(String[] args) {
		int data, dia, mes, ano;
		String nome_mes;
		
		Scanner in = new Scanner (System.in);
		System.out.print ("Digite uma data no formato ddmmaaaa: ");
		data = in.nextInt();
		in.close();
		
		dia = data/1000000;
		mes = (data / 10000) % 100;
		ano = data % 10000;
		
		switch (mes) {
		case 1:
			nome_mes = "Janeiro";
			break;
		case 2:
			nome_mes = "Fevereiro";
			break;
		case 3:
			nome_mes = "Março";
			break;
		case 4:
			nome_mes = "Abril";
			break;
		case 5:
			nome_mes = "Maio";
			break;
		case 6:
			nome_mes = "Junho";
			break;
		case 7:
			nome_mes = "Julho";
			break;
		case 8:
			nome_mes = "Agosto";
			break;
		case 9:
			nome_mes = "Setembro";
			break;
		case 10:
			nome_mes = "Outubro";
			break;
		case 11:
			nome_mes = "Novembro";
			break;
		case 12:
			nome_mes = "Dezembro";
			break;
		default: nome_mes = "Inválido";
		}
	System.out.println(dia + "/" + nome_mes + "/" + ano);
	}

}
