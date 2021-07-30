package exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		double comprimento;
		Scanner leitura = new Scanner(System.in);
		System.out.println("informe o comprimento: ");
		comprimento =leitura.nextDouble();
		
		double largura;
		System.out.println("informe a largura: ");
		largura =leitura.nextDouble();
		
		double altura;
		System.out.println("informe a altura:");
		altura = leitura.nextDouble();
		
		double volume = comprimento*largura*altura;
		System.out.println("valor do volume: "+volume);

	}

}
