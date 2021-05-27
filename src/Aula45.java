import java.util.Locale;
import java.util.Scanner;

public class Aula45 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		
		int x = sc.nextInt();
		int soma = 0;
		
		while (x != 0 ) {
			soma += x;
			//System.out.println("Loop Infinito");
			x = sc.nextInt();
		}
		
		System.out.println(soma);
		
		
		sc.close();
	}

}
