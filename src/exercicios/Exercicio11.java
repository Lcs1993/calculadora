package exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		int numero;
		Scanner leitura = new Scanner (System.in);
		System.out.println("informe o n�mero: ");
		numero = leitura.nextInt();
		
		int antecessor = numero - 1;
		int sucessor = numero + 1;
		System.out.println("n�mero antecessor: "+antecessor);
		System.out.println("n�mero sucessor: "+sucessor);
		
		

	}

}
