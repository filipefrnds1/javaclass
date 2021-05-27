import java.util.Locale;
import java.util.Scanner;

public class Aula38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos;
		
		System.out.println("Informe os minutos utilizados: ");
		minutos = sc.nextInt();
		
		
		double conta = 50.0;
		if(minutos > 100) {
			conta += (minutos - 100) * 2.0;// conta recebe conta + ...
			//Operadores de atribuição cumulativa 
			// a += b; é igual  a = a + b;
			// a -= b; é igual  a = a - b;
			// a *= b; é igual  a = a * b;
			// a /= b; é igual  a = a / b;
			// a %= b; é igual  a = a % b;
		}
		
		System.out.printf("O valor da conta = R$ %.2f%n", conta);
		
		
		sc.close();
	}

}
