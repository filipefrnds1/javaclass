import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
		//mensagem explicativa, 
		int x, y, soma;
		
			System.out.println("Informe o valor do primeiro número inteiro: ");
				x = sc.nextInt();
		
			System.out.println("Informe o valor do segundo número inteiro: ");
				y = sc.nextInt();
		
					soma = x + y;
		
			System.out.println("A Soma dos números informado acima é = " + soma);
		
		
			sc.close();
	}

}
