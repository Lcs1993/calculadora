package calculadora;

public class Calculadora {

	public static void main(String[] args) {
		int numero1 = 8;
		int numero2 = 26;
		int banana =  11;
		int resultado = numero1+numero2+banana;
		System.out.println("hello world");
		System.out.println("numero um "+numero1);
		System.out.println("numero dois "+numero2);
		System.out.println("numero tr�s " +banana);
		System.out.println("resultado da soma entre os numeros "+resultado);
		
		int subtracao = numero1 - numero2 - banana;
		System.out.println("resultado da subtra��o "+subtracao);
		int multiplicacao = numero1 * numero2 * banana;
		System.out.println("resultado da multiplica��o " +multiplicacao);
		double divisao = numero2/numero1;
		System.out.println("resultado da divis�o "+divisao);
		System.out.println("============================");
		
		int peso = 80;
		double altura =1.80;
		double imc = peso/(altura * altura);
		System.out.println("IMC " +imc);
	}

}
