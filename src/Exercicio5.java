import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a1, o codigo
//de uma pe�a 2, o n�mero de pelas 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		int codiPeca1,codiPeca2,numPeca1,numPeca2;
		
		double valorUniPeca1,valorUniPeca2,soma1,soma2,total;
		
			System.out.println("Informe o n�mero do c�digo da pe�a 1: ");
				codiPeca1 = sc.nextInt();
				
			System.out.println("Informe o n�mero de pe�as da pe�a n�mero " + codiPeca1 + " ! ");
			 	numPeca1 = sc.nextInt();
			 	
		 	System.out.println("Informe o valor unit�rio da pe�a n�mero " + codiPeca1 + " ! ");
		 		valorUniPeca1 = sc.nextDouble();
		 		
		 		soma1 = numPeca1 * valorUniPeca1;
		 		
			System.out.println("Informe o numero do codigo da pe�a 2: ");
			 	codiPeca2 = sc.nextInt();
			 		
			System.out.println("Informe o n�mero de pe�as da pe�a n�mero " + codiPeca2 + " ! ");
			 	numPeca2 = sc.nextInt();
			 		
			System.out.println("Informe o valor unit�rio da pe�a n�mero " + codiPeca2 + " ! ");
		 		valorUniPeca2 = sc.nextDouble();
		 		
		 		soma2 = numPeca2 * valorUniPeca2;
		 		
		 		total = soma1 + soma2;
		 		
		 	System.out.printf("O valor total a pagar � : R$ %.2f", total);
		 	
		 	 				
		 		
		sc.close();
	}

}
