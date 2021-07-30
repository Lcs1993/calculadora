package exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		double valorReal;
		Scanner leitura = new Scanner(System.in);
		System.out.println("informe o valor do real: ");
		valorReal = leitura.nextInt();
		
		double cotacaodoDolar;
		System.out.println("informe a cotação do dolar");
		cotacaodoDolar = leitura.nextDouble();
		
		double resultado = valorReal/cotacaodoDolar;
		
		System.out.println("valor convertido em dólar: "+resultado);

	}

}
