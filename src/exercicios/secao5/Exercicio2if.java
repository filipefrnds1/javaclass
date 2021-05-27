//Fazer um programa para ler um número inteiro e dizer se este número é par ou impar
package exercicios.secao5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2if {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		int num;
		
		System.out.println("Informe o valor do número inteiro: ");
		 	num = sc.nextInt();
		 
		 if(num % 2 == 0) {
			 System.out.println("O número é PAR !");
		 } else {
			 System.out.println("O número é IMPAR !");
		 }
		 sc.close();
	}

}
