import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses n�meros com uma 
		//mensagem explicativa, 
		int x, y, soma;
		
			System.out.println("Informe o valor do primeiro n�mero inteiro: ");
				x = sc.nextInt();
		
			System.out.println("Informe o valor do segundo n�mero inteiro: ");
				y = sc.nextInt();
		
					soma = x + y;
		
			System.out.println("A Soma dos n�meros informado acima � = " + soma);
		
		
			sc.close();
	}

}
