package Principal;

public class PrintfEOperadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = "Susana Muniz";
		int idade = 21;
		double altura = 1.65;
		boolean verdadeiro = true;
		boolean falso = false;
		
		//para o tipo Char usa %c
		
		System.out.printf("%s, tem %d, e sua altura é: %.2f\n", nome, idade, altura);
		
		/* Operadores de comparação:
		 *  > maior que
		 *  < menor que 
		 *  >= maior igual
		 *  <= menor igual 
		 *  != diferente 
		 *  == igual
		 */
		
		/* Operadores Lógicos:
		 * &  significa E
		 * || significa OU
		 * !  significa NEGAÇÃO
		 */
		
		// if == verdadeiro
		// else == se não
		
		if(verdadeiro || falso) {
			System.out.println(10);
		} else {
			System.out.println(20);
		}
		
		char opcao = 'S';
		int idade2 = 17;
		String diaSemana = "sexta-feira";
		
		// um unico if é uma estrutura simples 
		// if e else tem uma estrutura composta
		// else if é uma estrurua encadeada 
		// podemos ter estruturas dentro de cada if/else
		
		
		if(opcao == 'S' && idade2 >= 18) {
			System.out.println("Pode entrar na festa");
		} else {
			System.out.println("Não pode entrar na festa");
		} if(diaSemana.equals("segunda-feira")) {
			System.out.println("Segunda-feira");
		} else if(diaSemana.equals("terça-feira")) {
			System.out.println("terça-feira");
		} else if(diaSemana.equals ("sexta-feira")) {
			System.out.println("sexta-feira");
		} else {
			System.out.println("Não corresponde a um dia da semana!");
		}
			
		int diasSemana = 1;
		
		switch (diasSemana) {
		case 1: 
			System.out.println("Domingo");
			break;
		case 2: 
			System.out.println("Segunda");
			break;
		case 3: 
			System.out.println("Terça");
			break;
		case 4: 
			System.out.println("Quarta");
			break;
		case 5: 
			System.out.println("Quinta");
			break;
		case 6: 
			System.out.println("Sexta");
			break;
		case 7: 
			System.out.println("Sábado");
			break;
			
		default:
			System.out.println("Não corresponde a um dia da semana");
			break;
		} 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
