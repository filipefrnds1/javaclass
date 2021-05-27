//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
//X, se for o caso.
package exercicios.secao5;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int x;
		
		System.out.println("Informe um número inteiro: ");
		x = sc.nextInt();
		
		for(int i = 1; i <= x; i++) {
			if(i % 2 == 1) {
			System.out.println("Impar: " + i);
		}
		}
		
		
		
		sc.close();
	}

}
