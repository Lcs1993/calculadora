package exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		int variavelA;
		Scanner leitura = new Scanner (System.in);
		System.out.println("informe o valor da variavel A");
		variavelA = leitura.nextInt();
		
		int variavelB;
		System.out.println("informe o valor da variavel B");
		variavelB = leitura.nextInt();
		
		int variavelC;
		System.out.println("informe o valor da variavel C");
		variavelC = leitura.nextInt();
		
		int soma = variavelA+variavelB+variavelC;
		int quadrado = soma * soma;
		System.out.println("resultado do quadrado da soma: "+ quadrado);
		

	}

}
