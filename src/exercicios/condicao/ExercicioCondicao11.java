package exercicios.condicao;

import java.util.Scanner;

public class ExercicioCondicao11 {

	public static void main(String[] args) {
		double precoProduto;
		Scanner leitura = new Scanner (System.in);
		System.out.println("informe o valor do preço produto: ");
		precoProduto = leitura.nextDouble();
		
		int condicaoPagamento;
		System.out.println("informe o valor da condição pagamento: ");
		condicaoPagamento = leitura.nextInt();
		
		double valorFinal = 0;
		if(condicaoPagamento==1) {
			valorFinal = precoProduto*0.9;
			
		}else if(condicaoPagamento==2) {
			valorFinal= precoProduto*0.85;
		}else if(condicaoPagamento==3) {
			valorFinal=precoProduto;
		}else if(condicaoPagamento==4) {
			valorFinal=precoProduto*1.1;
		}
		System.out.println("preço final: "+valorFinal);
		

	}

}
