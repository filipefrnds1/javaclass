//Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o valor da �rea deste
//c�rculo com quatro casas decimais conforme exemplos.
//f�rmula da �rea: pi.raio�
//considere o valor de pi = 3.14159

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double area, pi, raio, raioAoQuadr;
		
		pi = 3.14159;
		
		System.out.println("Informe o valor do raio: ");
			raio = sc.nextDouble();
			
			raioAoQuadr = Math.pow(raio, 2.0);
			
			area = pi*raioAoQuadr;
			
			System.out.printf("O valor da area � = %.4f", area);
			
		sc.close();
		
		
	

	}

}
