import java.util.Scanner;

public class Aula35ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//int x = 5;
		int hora;
		
		System.out.println("Quantas horas?");
		 	hora = sc.nextInt();
		
		//System.out.println("Bom dia !");
		
		if(hora < 12) {
			System.out.println("Bom dia !");
		}
		else {
			if(hora > 12 && hora < 18) {
				System.out.println("Boa tarde !");
			}
			else{
				System.out.println("Boa noite !");		
			}
		}
		sc.close();
	}
}
