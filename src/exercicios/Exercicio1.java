package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		double salarioAtual = 1000;
		Scanner leitura = new Scanner(System.in);
		System.out.println("informe o salario atual: ");
		salarioAtual = leitura.nextDouble();
		
		double salarioNovo = salarioAtual*1.25;
		
		System.out.println("novo salário: " + salarioNovo);

	}

}
