package exercicios.condicao;

import java.util.Scanner;

public class ExercicioCondicao10 {

	public static void main(String[] args) {
		double peso;
		Scanner leitura = new Scanner(System.in);
		System.out.println("informe o peso: ");
		peso = leitura.nextDouble();
		
		double altura;
		System.out.println("informe altura: ");
		altura = leitura.nextDouble();
		
		double imc = peso/(altura*altura);
		
		if(imc<18.5) {
			System.out.println("abaixo do peso");
			
		}else if(imc<25) {
			System.out.println("peso normal");
		}else if(imc<30) {
			System.out.println("acima do peso");
			
		}else if(imc>30) {
			System.out.println("obeso");
		}

	}

}
