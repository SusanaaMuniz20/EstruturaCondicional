package Principal;

import java.util.Scanner;

public class Atividade_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("Entre com o primeiro n�mero: ");
		num1 = leia.nextInt();
		
		System.out.println("Entre com o segundo n�mero: ");
		num2 = leia.nextInt();
		
		if(num1 > num2) {
			System.out.println("Maior numero �: " + num1);
		} else {
			System.out.println("Maior n�mero �: " + num2);
		}
		
		
		
		leia.close();
		
	}

}
