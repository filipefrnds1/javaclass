import java.util.Locale;
import java.util.Scanner;

public class Aula26one {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);// Após inserir o Locale US, se usa o ponto nos valores double.
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				
		int y;
		y = sc.nextInt();// Leitura de inteiros		
		                //System.out.println("teste");
		String x;		
		x = sc.next();// Leitura de String
		
		double z;
		z = sc.nextDouble();// Leitura de Double Obs: precisa colocar o locale no inicio da 
							// função MAIN
		char w;
		w = sc.next().charAt(0);//o charAt 0 pega a primeira letra de uma string
		
			System.out.println("O número double digitado é: "+ z);//OBs: Se não usar Locale deve usar virgula
			System.out.println("O número digitado é :"+ y);
			System.out.println("Você digitou: "+ x);
			System.out.println("Você digitou a letra: "+ w);
			
		//Obs: agora vamos testar digitar os dados na mesma linha.
		y = sc.nextInt();
		x = sc.next();
		z = sc.nextDouble();
		w = sc.next().charAt(0);
			
			System.out.println("Dados digitados na mesma linha: ");
			System.out.println(y);
			System.out.println(x);
			System.out.println(z);
			System.out.println(w);
		sc.close();
	}

}
