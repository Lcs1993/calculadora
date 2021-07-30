package exercicios.condicao;

import java.util.Scanner;

public class ExercicioCondicao9 {

	public static void main(String[] args) {
		double altura;
		Scanner leitura = new Scanner (System.in);
		System.out.println("informe altura: ");
		altura =leitura.nextDouble();
		
		String genero;
		System.out.println("informe gênero:");
		genero = leitura.next();
		
		double resultado;
		if(genero.equals("m")) {
			resultado = (72.7 * altura) - 58;
			
		}else {
			resultado = (62.1 * altura) - 44.7;
		}
		System.out.println("peso ideal: "+resultado);
		

	}

}
