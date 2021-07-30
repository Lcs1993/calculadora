package exercicios.condicao;

import java.util.Scanner;

public class ExercicioCondicao5 {

	public static void main(String[] args) {
		int variavelA;
		Scanner leitura = new Scanner (System.in);
		System.out.println("informe valor do número: ");
		variavelA = leitura.nextInt();
		
		int resultado;
		if(variavelA>0) {
			resultado = variavelA * 2;
		}else {
			resultado = variavelA * 3;
		}
		System.out.println("resultado: "+resultado);
	}

}
