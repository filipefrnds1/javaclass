import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler quatro valores inteiros A,B,C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a formula: Diferenca = (A*B - C*D)
public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A,B,C,D,calculo;
		
			System.out.println("Informe o valor de A: ");
				A = sc.nextInt();
				
			System.out.println("Informe o valor de B: ");
				B = sc.nextInt();
				
			System.out.println("Informe o valor de C: ");
				C = sc.nextInt();
				
			System.out.println("Informe o valor de D: ");
				D = sc.nextInt();
				
			calculo = ( A * B - C * D );
			
			System.out.println("O valor da diferença do produto de AxB - CxD é = " + calculo);
		
		// TODO Auto-generated method stub
		sc.close();
	}

}
