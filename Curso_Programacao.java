import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		//Localidade
		Locale.setDefault(Locale.US);
		
		//Variaveis
		int y = 32;
		double x = 10.35675;
		
		//Impressoes
		System.out.println("Olá Mundo!!");
		System.out.println("Bom dia!!");
		
		System.out.println("Valor da Variavel Y: " + y);
		System.out.printf("Valor da Variavel X: %.2f%n",x);
		System.out.printf("Valor da Variavel X: %.4f%n",x);

		
		System.out.printf("VALOR X: %f VALOR Y: %d", x, y);
	}
}


