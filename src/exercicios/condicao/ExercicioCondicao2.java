package exercicios.condicao;

import java.util.Scanner;

public class ExercicioCondicao2 {

	public static void main(String[] args) {
		String nome;
		Scanner leitura = new Scanner(System.in);
		System.out.println("informe o nome");
		nome = leitura.next();
		
		String estadoCivil;
		System.out.println("informe o estadocivil");
		estadoCivil =leitura.next();
		
		String genero;
		System.out.println("informe o gênero");
		genero = leitura.next();
		
		
		if(genero.equalsIgnoreCase("f") && estadoCivil.equalsIgnoreCase("casada")) {
			int anosCasado;
			System.out.println("informe o tempo de casado");
			anosCasado = leitura.nextInt();
		}

	}

}
