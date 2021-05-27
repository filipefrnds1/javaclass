//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//Se o ponto estiver na origem, escreva a mensagem “Origem”.
//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a

package exercicios.secao5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7if {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		
		double x,y;
		
		System.out.println("Informe o valor de x com uma casa Decimal: ");
		 	x = sc.nextDouble();
		 	
		 System.out.println("Informe o valor de y com uma casa Decimal: ");
		  	y = sc.nextDouble();
		  	
		  	
		  /*	if(x == 0 && y == 0) {
		  		System.out.println("Origem: ");
		  	}else if(x >= 0 && y >= 0 ) {
		  		System.out.println("Quadrante 1");
		  	}else if(x >= 0 && y <= 0 ) {
		  		System.out.println("Quadrante 4");
		  	}else if(x <=0 && y <= 0) {
		  		System.out.println("Quadrante 3");
		  	}else if(x <= 0 && y >= 0) {
		  		System.out.println("Quadrante 2");
		  	}
		*/
		  	if (x == 0.0 && y == 0.0) {
				System.out.println("Origem");
			}
			else if (x == 0.0) {
				System.out.println("Eixo Y");
			}
			else if (y == 0.0) {
				System.out.println("Eixo X");
			}
			else if (x > 0.0 && y > 0.0) {
				System.out.println("Q1");
			}
			else if (x < 0.0 && y > 0.0) {
				System.out.println("Q2");
			}
			else if (x < 0.0 && y < 0.0) {
				System.out.println("Q3");
			}
			else {
				System.out.println("Q4");
			}
		
		
		
		
		
		
		sc.close();
	}

}
