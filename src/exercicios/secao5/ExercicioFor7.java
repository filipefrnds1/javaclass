//Fazer um programa para ler um n�mero inteiro positivo N. O programa deve ent�o mostrar na tela N linhas,
//come�ando de 1 at� N. Para cada linha, mostrar o n�mero da linha, depois o quadrado e o cubo do valor, conforme
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
		
		System.out.println("Informe um n�mero inteiro positivo: ");
		N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			System.out.println(i + " " + i * i + " " + i * i * i);
			
						
		}
		
		
		
		sc.close();
	}

}
