package Principal;

import java.util.Locale;
import java.util.Scanner;

public class MathELocale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// atalho para importar ctrl+shift+o
		
		final Locale ponto = new Locale ("en", "us");
		Scanner leia = new Scanner (System.in);
		
		double altura = 0;
		double decimal = 10.333333;
		
		
		//Pot�ncia
		System.out.println(Math.pow(2, 5));
		
		//Maior n�mero entre dois n�meros ou vari�veis 
		System.out.println(Math.max(2, 10));
		
		//Menor n�mero entre dois n�meros ou vari�veis 
		System.out.println(Math.min(2, 10));
		
		//obter raiz quadrada
		System.out.println(Math.sqrt(144));
		
		//arredondar n�meros
		System.out.println(Math.round(decimal));
		
		//N�mero PI armazenado
		System.out.println(Math.PI);
		
		
		/* System.out.printf("Resultado : %.2f", decimal);
		double numero = 0;
		System.out.println("Resultado: " + (decimal + numero));
		
		/*system.out.println("Entre com sua altura: ");
		altura = leia.useLocale(ponto).nextDouble();
		
		system.out.println("A altura digitada foi: " + altura); */
		
		leia.close();
		
	}
 
}
