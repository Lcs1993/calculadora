package exercicios.condicao;

import java.util.Scanner;

public class ExercicioCondicao12 {

	public static void main(String[] args) {
		int numeroIdentificacao;
		Scanner leitura =new Scanner (System.in);
		System.out.println(("informe o valor do numero identificação: "));
		numeroIdentificacao = leitura.nextInt();
		
		double nota1;
		System.out.println("informe o valor da nota 1:");
		nota1 = leitura.nextDouble();
		
		double nota2;
		System.out.println("informe o valor da nota 2: ");
		nota2 = leitura.nextDouble();
		
		double nota3;
		System.out.println("informe o valor da nota 3:");
		nota3 = leitura.nextDouble();
		
		double media;
		System.out.println("informe o valor da média: ");
		media = leitura.nextDouble();
		
		double nota=(nota1+nota2*2+nota3*3+media)/7;
		String notaLetra = null;
		
		if(nota>=90) {
			notaLetra="A";
		}else if(nota<90 && nota>=75) {
			notaLetra="B";
		}else if(nota<75 && nota>=60) {
			notaLetra="C";
		}else if(nota<60 && nota>=40) {
			notaLetra="D";
		}else if(nota<40) {
			notaLetra="E";
		}
		System.out.println("nota e letra: "+notaLetra);
		
		if(notaLetra.equals("A") || notaLetra.equals("B") || notaLetra.equals("C")) {
			System.out.println("aprovado");
		}else if(notaLetra.equals("D")|| notaLetra.equals("E")) {
			System.out.println("reprovado");
		}
	}

}
