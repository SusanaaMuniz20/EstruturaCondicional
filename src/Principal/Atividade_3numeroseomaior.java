package Principal;

import java.util.Scanner;

public class Atividade_3numeroseomaior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		System.out.println("Entre com o primeiro n�mero: ");
		num1 = leia.nextInt();
		
		System.out.println("Entre com o segundo n�mero: ");
		num2 = leia.nextInt();
		
		System.out.println("Entre com o terceiro n�mero: ");
		num3 = leia.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("N�mero " + num1 + " � o maior n�mero");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("N�mero " + num2 + " � o maior n�mero");
		} else {
			System.out.println("\nN�mero " + num3 + " � o maior n�mero");
		}
		
		
		leia.close();
		
	}

}
