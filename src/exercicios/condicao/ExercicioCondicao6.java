package exercicios.condicao;

import java.util.Scanner;

public class ExercicioCondicao6 {

	public static void main(String[] args) {
		boolean variavelA ;
		Scanner leitura = new Scanner (System.in);
		System.out.println("informe o valor da variavel: ");
		variavelA = leitura.nextBoolean();
		
		boolean variavelB;
		System.out.println("informe o valor da variavel B");
		variavelB = leitura.nextBoolean();
		
		if(variavelA==true) {
			System.out.println("variavel A � verdadeira");
			
		}else {
			System.out.println("variavel A � falsa");
		}
		if (variavelB==true) {
			System.out.println("variavel B � verdadeira");
			
		}else {
			System.out.println("variavel B � falsa");
		}
		

	}

}
