package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		double salarioAtual = 1000;
		Scanner leitura = new Scanner(System.in);
		System.out.println("informe sal�rio atual: ");
		salarioAtual = leitura.nextDouble();

		int porcentagem = 10;
		System.out.println("informe porcentagem do novo sal�rio: ");
		porcentagem = leitura.nextInt();
		
		double salarioNovo = salarioAtual+(salarioAtual * porcentagem/100);
		System.out.println("novo sal�rio: "+salarioNovo);

	}

}
