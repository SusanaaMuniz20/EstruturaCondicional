package Principal;

import java.util.Scanner;

public class Atividade_anobissexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		//dgitar um ano e dizer se � bissexto
		
		int ano = 0;
		
		System.out.println("Entre com o ano para saber se � bissexto: ");
		ano = leia.nextInt();
		
		if (ano % 4 == 0 && ano % 100 != 0) {
			System.out.println("� um ano bissexto: ");
		} else if (ano % 400 == 0) {
			System.out.println("� um ano bissexto: ");
		} else {
			System.out.println("N�o � um ano bissexto! ");
		}
		
		leia.close();
		
		
		
		
		
	}

}
