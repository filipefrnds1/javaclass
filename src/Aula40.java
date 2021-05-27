import java.util.Locale;
import java.util.Scanner;

// Expressão Condicional Ternária
//Sintaxe: (condição) ? valor_se_verdadeiro : valor_se_falso

public class Aula40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ?  preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
		
		
		sc.close();
	}

}
