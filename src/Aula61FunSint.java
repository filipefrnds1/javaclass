import java.util.Locale;
import java.util.Scanner;

public class Aula61FunSint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		//pricipais vantagens das funções:
		// modularização, delegação e reaproveitamento.
		// modulação: divide seu programa em várias partes.
		// delegação: delega a logica de calcular alguma coisa para outro lugar, programa mais inchuto.
		// reaproveitamento: reaproveitar as funções várias vezes.
		//
		double p = Math.sqrt(25.0);
		
		System.out.println(p);
		int x,y,z;
		
		System.out.println("Enter three numbers: ");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		int higher = max(x,y,z);
		
		showResult(higher);
		/*if ( x > y && x > z ) {
			System.out.println("Higher = " + x);
		}else if (y > x && y > z) {
			System.out.println("Higher = " + y);
		}else {
			System.out.println("Higher = " + z);
		}*/
		sc.close();
	}
	
	public static int max(int a, int b, int c) {
		int aux;
		if ( a > b && a > c ) {
			aux = a;
		}else if ( b > c) {
			aux = b;
		}else {
			aux = c;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}

}
