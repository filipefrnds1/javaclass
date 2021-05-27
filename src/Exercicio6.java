import java.util.Locale;
import java.util.Scanner;

// Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule 
// e mostre:
// a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
// b) a �rea do c�rculo de raio C. (pi = 3.14159)
// c) a �rea do trap�zio que tem A e B por bases e C por altura.
// d) a �rea do quadrado que tem lado B.
// e) a �rea do ret�ngulo que tem lados A e B.

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
		
		System.out.printf("�rea do Triangulo: %.3f%n", areaTriRet);
		
		System.out.printf("�rea do Circulo: %.3f%n", areaCir);
		
		System.out.printf("�rea do Trap�zio: %.3f%n", areaTrap);
		
		System.out.printf("�rea do Quadrado: %.3f%n", areaQuadr);
		
		System.out.printf("�rea do Retangulo: %.3f%n", areaRet);
				
		
			
		sc.close();
	}

}
