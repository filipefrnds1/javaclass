//Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe
//por hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, 
//com duas casa decimais.
import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int numFun, horasTrab;
		
		double valorHora, salarioFun;
		
		System.out.println("Informe o n�mero do funcion�rio: ");
			numFun = sc.nextInt();
			
		System.out.println("Informe as horas trabalhadas do funcion�rio: ");
			horasTrab = sc.nextInt();
			
		System.out.println("Informe o valor da hora trabalhada do funcion�rio: ");
			valorHora = sc.nextDouble();
			
		salarioFun = horasTrab * valorHora;
		
		System.out.printf("O n�mero do funcion�rio � = %d e o sal�rio � = R$ %.2f", numFun, salarioFun);
		
		
		
		
		
		
		
		
		sc.close();
	}

}
