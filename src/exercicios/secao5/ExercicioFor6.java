//Ler um número inteiro N e calcular todos os seus divisores.
package exercicios.secao5;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		int N;
		System.out.println("Informe um número inteiro: ");
		N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			if(N % i == 0) {
				System.out.println(i);
			}
		}
		
		
		sc.close();
	}

}
