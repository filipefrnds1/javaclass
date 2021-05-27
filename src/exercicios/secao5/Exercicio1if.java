//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
package exercicios.secao5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1if {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		int num;
		
		System.out.println("Informe o valor do número inteiro: ");
		 	num = sc.nextInt();
		
		if(num >= 0) {
			System.out.println("Não é Negativo !");
		}
		else {
			System.out.println("É Negativo !");
		}
		
		
		
		
		
		sc.close();
	}

}
