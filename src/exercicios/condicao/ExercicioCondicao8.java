package exercicios.condicao;

import java.util.Scanner;

public class ExercicioCondicao8 {

	public static void main(String[] args) {
		int variavelA;
		Scanner leitura = new Scanner (System.in);
		System.out.println("informe o valor da variavel A: ");
		variavelA = leitura.nextInt();
		
		int variavelB;
		System.out.println("informe o valor da variavel B:");
		variavelB = leitura.nextInt();
		
		int variavelC;
		System.out.println("informe o valor da variavel C: ");
		variavelC = leitura.nextInt();
		
		 
		 if(variavelA<variavelB) {
			 
		 }
		if(variavelA<variavelC) {
			
		}
		if(variavelB>variavelC) {
			int auxiliar = variavelB;
			variavelB=variavelC;
			variavelC=auxiliar;
					
					
		}
		System.out.println("variaveis em ordem crescente: ");
		System.out.println(variavelA);
		System.out.println(variavelB);
		System.out.println(variavelC);
		
		
		

	}

}
