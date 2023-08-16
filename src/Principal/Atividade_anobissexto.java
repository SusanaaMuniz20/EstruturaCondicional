package Principal;

import java.util.Scanner;

public class Atividade_anobissexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		//dgitar um ano e dizer se é bissexto
		
		int ano = 0;
		
		System.out.println("Entre com o ano para saber se é bissexto: ");
		ano = leia.nextInt();
		
		if (ano % 4 == 0 && ano % 100 != 0) {
			System.out.println("É um ano bissexto: ");
		} else if (ano % 400 == 0) {
			System.out.println("É um ano bissexto: ");
		} else {
			System.out.println("Não é um ano bissexto! ");
		}
		
		leia.close();
		
		
		
		
		
	}

}
