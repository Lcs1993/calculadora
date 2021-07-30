package exercicios.condicao;

import java.util.Scanner;

public class ExercicioCondicao3 {

	public static void main(String[] args) {
		int numeroQualquer;
		Scanner leitura = new Scanner(System.in);
		System.out.println("informe o numero: ");
		numeroQualquer =leitura.nextInt();
		
		if (numeroQualquer%2==0) {
			System.out.println("numero par");
		}else {
			System.out.println("numero impar");
		}

	}

}
