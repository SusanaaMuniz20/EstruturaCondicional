package Principal;

import java.util.Scanner;

public class Atividade_imparpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		
		int numero = 0;
		
		System.out.println("Entre com um número para saber se ele é impar ou par: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println(numero + " é par");
		} else {
			System.out.println(numero + " é impar");
		}
		
		
		
		leia.close();
		
		
	}

}
