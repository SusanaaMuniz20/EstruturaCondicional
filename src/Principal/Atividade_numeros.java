package Principal;

import java.util.Scanner;

public class Atividade_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("Entre com o primeiro número: ");
		num1 = leia.nextInt();
		
		System.out.println("Entre com o segundo número: ");
		num2 = leia.nextInt();
		
		if(num1 > num2) {
			System.out.println("Maior numero é: " + num1);
		} else {
			System.out.println("Maior número é: " + num2);
		}
		
		
		
		leia.close();
		
	}

}
