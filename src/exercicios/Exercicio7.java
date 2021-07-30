package exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		int variavelA;
		Scanner leitura = new Scanner(System.in);
		System.out.println("informe o valor da variavel A: ");
		variavelA = leitura.nextInt();
		
		int variavelB;
		System.out.println("informe o valor da variavel B: ");
		variavelB = leitura.nextInt();

		int  diferenca = variavelA-variavelB;
		int quadrado = diferenca*diferenca;
		System.out.println("resultado do quadrado da diferença: "+quadrado);
	}

}
