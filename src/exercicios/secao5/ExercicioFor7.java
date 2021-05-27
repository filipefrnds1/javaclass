//Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
//exemplo.

package exercicios.secao5;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		int N;
		
		System.out.println("Informe um número inteiro positivo: ");
		N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			System.out.println(i + " " + i * i + " " + i * i * i);
			
						
		}
		
		
		
		sc.close();
	}

}
