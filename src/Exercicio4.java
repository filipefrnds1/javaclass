//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe
//por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, 
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
		
		System.out.println("Informe o número do funcionário: ");
			numFun = sc.nextInt();
			
		System.out.println("Informe as horas trabalhadas do funcionário: ");
			horasTrab = sc.nextInt();
			
		System.out.println("Informe o valor da hora trabalhada do funcionário: ");
			valorHora = sc.nextDouble();
			
		salarioFun = horasTrab * valorHora;
		
		System.out.printf("O número do funcionário é = %d e o salário é = R$ %.2f", numFun, salarioFun);
		
		
		
		
		
		
		
		
		sc.close();
	}

}
