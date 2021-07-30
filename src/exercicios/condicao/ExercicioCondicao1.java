package exercicios.condicao;

import java.util.Scanner;

public class ExercicioCondicao1 {

	public static void main(String[] args) {
		int variavelA;
		Scanner leitura = new Scanner(System.in);
		System.out.println("informe o valor da variavel A: ");
		variavelA =leitura.nextInt();
		
		int variavelB;
		System.out.println("informe o valor da variavel B: ");
		variavelB = leitura.nextInt();
		
		int variavelC;
		System.out.println("informe o valor da variavel C: ");
		variavelC = leitura.nextInt();
		
		int soma = variavelA+variavelB;
		if(soma>variavelC) {
			System.out.println("valor da soma: "+soma);
		}
		
;
	}

}
