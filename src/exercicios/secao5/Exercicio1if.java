//Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
package exercicios.secao5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1if {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		int num;
		
		System.out.println("Informe o valor do n�mero inteiro: ");
		 	num = sc.nextInt();
		
		if(num >= 0) {
			System.out.println("N�o � Negativo !");
		}
		else {
			System.out.println("� Negativo !");
		}
		
		
		
		
		
		sc.close();
	}

}
