package calculadora;

import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {
		// nome,data de nascimento,idade,cidade,altura,maior de idade,gênero
		
		String dataNascimento = "01/01/2010";
		int idade = 11 ;
		String cidade = "Osasco";
		double altura = 1.40;
		boolean maiorIdade = false;
		char genero = 'F';
		
	    
		
	    Scanner leitura = new Scanner(System.in);
	    String nomeInformado;
	    System.out.println("informe o nome: ");
	    nomeInformado = leitura.next();
	    System.out.println("informe data de nascimento: ");
	    dataNascimento = leitura.next();
	    System.out.println("informe cidade: ");
	    cidade = leitura.next();
	    System.out.println("informe idade: ");
	    idade = leitura.nextInt();
	    System.out.println("informe altura: ");
	    altura = leitura.nextDouble();
	    System.out.println("informe o gênero: ");
	    genero = leitura.next().charAt(0);
	    System.out.println("você é maior de idade? ");
	    maiorIdade = leitura.hasNext();
	    
	    
		System.out.println("Cadastro de Pessoas");
		System.out.println("Nome: "+nomeInformado);
		System.out.println("Data de nascimento: "+dataNascimento);
		System.out.println("idade: "+idade);
		System.out.println("cidade: "+cidade);
		System.out.println("altura:" +altura);
		System.out.println("maior de idade: "+maiorIdade);
		System.out.println("gênero: "+genero);
		
		if (idade >=18) {
			System.out.println("maior de idade");
		}else {
			System.out.println("menor de idade");
		}

	}

}
