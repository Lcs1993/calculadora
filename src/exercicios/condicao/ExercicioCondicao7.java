package exercicios.condicao;

import java.util.Scanner;

public class ExercicioCondicao7 {

	public static void main(String[] args) {
		int variavelA;
		Scanner leitura = new Scanner (System.in);
		System.out.println("informe o valor da variavel A: ");
		variavelA = leitura.nextInt();
		
		int resultado;
		if(variavelA%2==0) {
			resultado = variavelA+5;
		}else {
			resultado = variavelA+8;
			
		}
		System.out.println("resultado: "+resultado);

	}

}
