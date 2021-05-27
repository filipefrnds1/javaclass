//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

package exercicios.secao5;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioWhile2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
					
		// TODO Auto-generated method stub
		int x,y;
		System.out.println("Informe x: ");
		x = sc.nextInt();
		System.out.println("Informe y: ");
		y = sc.nextInt();
		
		while(x != 0 && y != 0) {
			
			if(x > 0 && y > 0) {
			System.out.println("Primeiro");
			
			}else if (x > 0 && y < 0 ) {
				System.out.println("Quarto");
				
			}else if( x < 0 && y < 0) {
				System.out.println("Terceiro");
				
			}else {
				System.out.println("Segundo");
				
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		
		System.out.println(" ");
		
		sc.close();
	}

}
