//Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em Fahrenheit. Perguntar se o 
//usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o programa.
//Formula: F = (9C / 5) + 32

import java.util.Locale;
import java.util.Scanner;

public class Aula55 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		double cels,fahr;
		char x;
		
		
		do {
				System.out.println("Digite a temperatura em Celsius: ");
					cels = sc.nextDouble();
					fahr = ((9*cels)/5) + 32;
				System.out.printf("Equivalente em Fahrenheit: %.1f%n ", fahr);
				System.out.println("Deseja repetir (s/n)? ");
					x = sc.next().charAt(0);
			
		}while(x == 's');
		
		
		
		sc.close();
	}

}
