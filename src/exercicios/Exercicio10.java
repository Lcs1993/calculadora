package exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		int variavelA;
		Scanner leitura =new Scanner(System.in);
		System.out.println("informe valor da variavel A");
		variavelA = leitura.nextInt();
		
		int variavelB;
		System.out.println("informe valor da variavel B");
		variavelB = leitura.nextInt();
		
		int soma = variavelA+variavelB;
		int subtracao = variavelA-variavelB;
		int divisao = variavelA/variavelB;
		int multiplicacao = variavelA*variavelB;
		System.out.println("o resultado da soma:  "+soma);
		System.out.println("o resultado da subtra��o: "+subtracao);
		System.out.println("o resultado da divis�o: "+divisao);
		System.out.println("o resultado da multiplica��o: "+multiplicacao);
		
	}

}
