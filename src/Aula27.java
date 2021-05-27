import java.util.Scanner;

public class Aula27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();// com essa situação o s1 vai ficar com a quebra de linha,
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();// quebra de linha com enter,
		s3 = sc.nextLine();
		//Obs: Quando você usa um comando de leitura diferente do nextline() e dá alguma quebra de linha, essa quebra de linha 
		//fica "pendente" na entrada padrão.
		//Solução: inserir um nextline apos o nextint apenas para receber a quebra de linha
			System.out.println("Dados Digitados: ");
			System.out.println(x);
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			
		sc.close();
	}

}
