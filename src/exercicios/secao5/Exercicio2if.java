//Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou impar
package exercicios.secao5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2if {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		int num;
		
		System.out.println("Informe o valor do n�mero inteiro: ");
		 	num = sc.nextInt();
		 
		 if(num % 2 == 0) {
			 System.out.println("O n�mero � PAR !");
		 } else {
			 System.out.println("O n�mero � IMPAR !");
		 }
		 sc.close();
	}

}
