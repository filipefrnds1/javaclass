import java.util.Locale;
import java.util.Scanner;
//debug eclipse
//breakpoint
public class Aula44 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();// aba run + toggle breakpoint
		//para executar precisa clicar com o botão direito na clase em debug as + java aplication
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("Arae = %.2f%n", area);
		System.out.printf("Preco = %.2f%n", preco);
		
		sc.close();
	}

}
