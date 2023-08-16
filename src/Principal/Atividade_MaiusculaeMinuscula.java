package Principal;

import java.util.Scanner;

public class Atividade_MaiusculaeMinuscula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		
		char sexo;
		
		System.out.println("Digite o sexo (m/f)");
		sexo = leia.next().charAt(0);
		
		if(Character.toLowerCase(sexo) == 'm') {
			System.out.println("O sexo digitado foi masculino " + sexo);
		} else {
			System.out.println("O sexo digitado foi feminino ");
		}
		
		
		leia.close();
		
	}

}
