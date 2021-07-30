package exercicios.condicao;

import java.util.Scanner;

public class ExercicioCondicao4 {

	public static void main(String[] args) {
		int variavelA;
		Scanner leitura =new Scanner (System.in);
		System.out.println("informe o valor do numero: ");
		variavelA = leitura.nextInt();
		
		int variavelB;
		System.out.println("informe o valor do numero: ");
		variavelB = leitura.nextInt();
		
		int resultado;
		if(variavelA==variavelB) {
			resultado = variavelA+variavelB;
		}else {
			resultado = variavelA*variavelB;
		}
		System.out.println("o resultado dos valores: "+resultado);
		
	}

}
