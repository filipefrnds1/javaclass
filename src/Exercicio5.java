import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça1, o codigo
//de uma peça 2, o número de pelas 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		int codiPeca1,codiPeca2,numPeca1,numPeca2;
		
		double valorUniPeca1,valorUniPeca2,soma1,soma2,total;
		
			System.out.println("Informe o número do código da peça 1: ");
				codiPeca1 = sc.nextInt();
				
			System.out.println("Informe o número de peças da peça número " + codiPeca1 + " ! ");
			 	numPeca1 = sc.nextInt();
			 	
		 	System.out.println("Informe o valor unitário da peça número " + codiPeca1 + " ! ");
		 		valorUniPeca1 = sc.nextDouble();
		 		
		 		soma1 = numPeca1 * valorUniPeca1;
		 		
			System.out.println("Informe o numero do codigo da peça 2: ");
			 	codiPeca2 = sc.nextInt();
			 		
			System.out.println("Informe o número de peças da peça número " + codiPeca2 + " ! ");
			 	numPeca2 = sc.nextInt();
			 		
			System.out.println("Informe o valor unitário da peça número " + codiPeca2 + " ! ");
		 		valorUniPeca2 = sc.nextDouble();
		 		
		 		soma2 = numPeca2 * valorUniPeca2;
		 		
		 		total = soma1 + soma2;
		 		
		 	System.out.printf("O valor total a pagar é : R$ %.2f", total);
		 	
		 	 				
		 		
		sc.close();
	}

}
