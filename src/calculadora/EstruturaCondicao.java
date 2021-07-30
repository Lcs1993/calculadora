package calculadora;

import java.util.Scanner;

public class EstruturaCondicao {

	public static void main(String[] args) {
		String genero;
		Scanner leitura =new Scanner (System.in);
		System.out.println("informe o genêro: ");
		genero = leitura.next();
		
		if(genero.equals("m")) {
			System.out.println("genero masculino");
		}else if(genero.equals("f")) {
			System.out.println("genero feminino");
			
		}else {
			System.out.println("genero incorreto");
		}
			

	}

}
