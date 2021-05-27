// Leia 2 valores inteiro (A e B). Após, o programa deve mostrar uma mensagem "São Multiplos" ou " Não são Multiplos"
// indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem
// crescente ou decrescente.

package exercicios.secao5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3if {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		int A,B;
		
		System.out.println("Informe o valor de A: ");
		 	A = sc.nextInt();
		 	
		 System.out.println("Informe o valor de B: ");
		  	B = sc.nextInt();
		  	
			  System.out.println("São Múltiplos !");
			  if(A % B == 0 || B % A == 0) {			//Obs: pipe no teclado americano é alt + 124
		  } else {
			  System.out.println("Não são Multiplos !");
		  }
		
		
		
		
		
		
		sc.close();
	}

}
