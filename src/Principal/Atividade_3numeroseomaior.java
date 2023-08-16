package Principal;

import java.util.Scanner;

public class Atividade_3numeroseomaior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		System.out.println("Entre com o primeiro número: ");
		num1 = leia.nextInt();
		
		System.out.println("Entre com o segundo número: ");
		num2 = leia.nextInt();
		
		System.out.println("Entre com o terceiro número: ");
		num3 = leia.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("Número " + num1 + " é o maior número");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("Número " + num2 + " é o maior número");
		} else {
			System.out.println("\nNúmero " + num3 + " é o maior número");
		}
		
		
		leia.close();
		
	}

}
