//Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo que o mesmo
//pode come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.

package exercicios.secao5;

import java.util.Scanner;

public class Exercicio4if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, duracao;
		
		System.out.println("Informe a hora inicial do jogo: ");
				horaInicial = sc.nextInt();
		System.out.println("Informe a hora final do jogo: ");		
				horaFinal = sc.nextInt();
				
		if(horaInicial >= horaFinal) {
			duracao = 24 - horaInicial + horaFinal;
			System.out.println("A dura��o do jogo foi de " + duracao +" hora(s).");
		}else {
				duracao = horaFinal - horaInicial;
				System.out.println("A dura��o do jogo foi de " + duracao +" hora(s).");
			}
		
				
		sc.close();
	}

}
