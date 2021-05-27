//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

package exercicios.secao5;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			
			if(b != 0) {
				double c = a / b;
				System.out.printf("%.1f%n",c);
			}else {
				System.out.println("Divisão Impossivel !");
			}
			
		}
		
		
		
		sc.close();
	}

}
