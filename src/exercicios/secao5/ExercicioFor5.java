//Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//Lembrando que, por definição, fatorial de 0 é 1.



package exercicios.secao5;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		int num1,num2,x;
		
		System.out.println("Informe um número inteiro: ");
		num1 = sc.nextInt();
		
		x = num1;
		num2 = num1;
		//int n = sc.nextInt();
		//int fat = 1;
		//for(int i=1; i<=n; i++){
		//fat = fat * i;
		//}
		//System.out.println(fat);
		if(num1 >= 0) {
			
			for(int i = x; i != 1; i--) {
				num1 = num1 * (num2 - 1);
			    num2 = num2 - 1;
			}
						
		}else {
			System.out.println("Fatorial não admite números negativos !");
		}
		
		if(num1 == 0) {
			num1 = 1;
			System.out.println(num1);
		}else {
			System.out.println(num1);
		}
		
		sc.close();
	}

}
