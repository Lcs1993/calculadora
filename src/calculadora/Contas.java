package calculadora;

public class Contas {

	public static void main(String[] args) {
		int salario =1150;
		int luz = 120;
		double telefone = 51.50;
		double agua = 83.50;
		double resultado = salario - luz - telefone - agua ;
		System.out.println("você ainda tem disponivel: R$ "+resultado);
	}

}
