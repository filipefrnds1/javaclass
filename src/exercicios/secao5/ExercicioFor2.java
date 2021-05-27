//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

package exercicios.secao5;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		int N, x,in1,out1;
		x = 0;
		in1 = 0;
		out1 = 0;
		
		System.out.println("informe a quantidade de valores que serão lidos: ");
		N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			System.out.printf("Informe o valor numero %d%n ",i + 1);
			x = sc.nextInt();
			if(x >= 10 && x <= 20) {
				in1 = in1 + 1;
			}else {
				out1 = out1 + 1;
			}
		}
		
		System.out.println(in1 + " in");
		System.out.println(out1 + " out");
		
		sc.close();
	}

}
