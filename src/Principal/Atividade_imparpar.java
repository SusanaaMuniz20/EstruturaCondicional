package Principal;

import java.util.Scanner;

public class Atividade_imparpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		
		int numero = 0;
		
		System.out.println("Entre com um n�mero para saber se ele � impar ou par: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println(numero + " � par");
		} else {
			System.out.println(numero + " � impar");
		}
		
		
		
		leia.close();
		
		
	}

}
