package exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	
		
		int sacoRacao = 1;
		Scanner leitura = new Scanner (System.in);
		System.out.println("informe o saco ração: ");
		sacoRacao =leitura.nextInt();
		
		int quantidadeRacao = 100;
		System.out.println("informe a quantidade ração em gramas: ");
		quantidadeRacao = leitura.nextInt();
		
		int quantidadeGatos =2;
		int consumo = quantidadeGatos * quantidadeRacao;
		double consumo5Dias = consumo * 5;
		double sacoRacaoGramas = sacoRacao * 1000;
		double resultado = sacoRacaoGramas - consumo5Dias;
		System.out.println("quantidade de ração disponivel no saco em gramas: "+resultado);

	}

}
