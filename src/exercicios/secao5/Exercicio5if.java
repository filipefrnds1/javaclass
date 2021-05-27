//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.

package exercicios.secao5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5if {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		int item, qntdad;
		
		double dogHot = 4.00;
		double xSalada = 4.50;
		double xBacon = 5.00;
		double torradaSimples = 2.00;
		double refri = 1.50;
		double valorFinal;
		
		System.out.println("Escolha um item abaixo informando o código: ");
		System.out.println("1 - Cachorro Quente: ");
		System.out.println("2 - X-Salada: ");
		System.out.println("3 - X-Bacon: ");
		System.out.println("4 - Torrada Simples: ");
		System.out.println("5 - Refrigerante: ");
		
		item = sc.nextInt();
		
		if(item < 1 || item > 5) {
			System.out.println("O item não existe na lista !");
		}else {
						
		System.out.println("Agora informe a quantidade do item: ");
		qntdad = sc.nextInt();
		
		if(item == 1) {
			valorFinal = qntdad * dogHot;
			System.out.printf("Total : R$ %.2f%n", valorFinal);
			
		}else if(item == 2) {
			valorFinal = qntdad * xSalada;
			System.out.printf("Total : R$ %.2f%n", valorFinal);
			
		}else if(item == 3) {
			valorFinal = qntdad * xBacon;
			System.out.printf("Total : R$ %.2f%n", valorFinal);
			
		}else if(item == 4) {
			valorFinal = qntdad * torradaSimples;
			System.out.printf("Total : %.2f%n", valorFinal);
			
		}else {
			valorFinal = qntdad * refri;
			System.out.printf("Total : R$ %.2f%n", valorFinal);
			
		}
		
		}
		
		
		
		sc.close();
	}

}
