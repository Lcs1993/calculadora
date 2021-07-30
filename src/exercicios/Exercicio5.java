package exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int variavelA = 10;
		Scanner leitura = new Scanner (System.in);
		System.out.println("informe a variavel A: ");
		variavelA = leitura.nextInt();
		
		int variavelB;
		System.out.println("informe a variavel B: ");
		variavelB = leitura.nextInt();
		
		int auxiliar = variavelA;
		variavelA = variavelB;
		variavelB = auxiliar;
		System.out.println("valor da variavel A: "+variavelA);
		System.out.println("valor da variavel B: "+variavelB);

	}

}
