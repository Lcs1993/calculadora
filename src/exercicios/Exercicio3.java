package exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	
		
		int anoNascimento = 2000;
		Scanner leitura = new Scanner (System.in);
		System.out.println("informe ano nascimento: ");
		anoNascimento = leitura.nextInt();
		
		int anoAtual = 2021;
		System.out.println(" informe ano atual: ");
		anoAtual = leitura.nextInt();
		
		int idade = anoAtual - anoNascimento;
		System.out.println("idade: "+idade);
		
		int meses = idade*12;
		System.out.println("idade em meses: "+meses);
		int dias = idade * 365;
		System.out.println("idade em dias: "+dias);
		int semanas = idade*52;
		System.out.println("idade em semana: "+semanas);
		

	}

}
