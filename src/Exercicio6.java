import java.util.Locale;
import java.util.Scanner;

// Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule 
// e mostre:
// a) a área do triângulo retângulo que tem A por base e C por altura.
// b) a área do círculo de raio C. (pi = 3.14159)
// c) a área do trapézio que tem A e B por bases e C por altura.
// d) a área do quadrado que tem lado B.
// e) a área do retângulo que tem lados A e B.

public class Exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double areaTriRet, areaCir, areaTrap, areaQuadr, areaRet, A, B, C, pi;
		
		pi = 3.14159;
		
		System.out.println("Informe o valor para A: ");
		 		A = sc.nextDouble();
		 		
		System.out.println("Informe o valor para B: ");
		 		B = sc.nextDouble();
		 		
		System.out.println("Informe o valor para C: ");
				C = sc.nextDouble();
				
			areaTriRet = ( A * C ) / 2;
			
			areaCir = pi * Math.pow(C, 2.0);
			
			areaTrap = (( A + B ) * C) / 2;
			
			areaQuadr = B * B;
			
			areaRet = A * B;
		
		System.out.printf("Área do Triangulo: %.3f%n", areaTriRet);
		
		System.out.printf("Área do Circulo: %.3f%n", areaCir);
		
		System.out.printf("Área do Trapézio: %.3f%n", areaTrap);
		
		System.out.printf("Área do Quadrado: %.3f%n", areaQuadr);
		
		System.out.printf("Área do Retangulo: %.3f%n", areaRet);
				
		
			
		sc.close();
	}

}
