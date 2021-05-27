//Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
//que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
//qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
//Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
//mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
//Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
//salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
//de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
//duas casas decimais.

package exercicios.secao5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8if {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		double valor1,valorTotalImp1,valorTotalImp2,valorTotalImp3;
		double valor;
		
		System.out.println("Informe o valor do seu salário em Lisarb: ");
			valor1 = sc.nextDouble();
			valor = 0;
			if(valor1 <= 2000.00) {
				System.out.println("Isento !");
			}else if(valor1 <= 3000.00) {
				valorTotalImp1 = valor1 - 2000.00;
				valorTotalImp1 = valorTotalImp1 * 0.08;
				valor = valorTotalImp1;
			}else if(valor1 <= 4500.00) {
				valorTotalImp1 = valor1 - 2000.00;
				valorTotalImp2 = valorTotalImp1 - 1000.00;
				valorTotalImp1 = (valorTotalImp1 - valorTotalImp2) * 0.08;
				valorTotalImp2 = valorTotalImp2 * 0.18;	
				valor = valorTotalImp1 + valorTotalImp2;
			}else {
				valorTotalImp1 = valor1 - 2000.00;
				valorTotalImp2 = valorTotalImp1 - 1000.00;
				valorTotalImp3 = valorTotalImp2 - 1500.00;
				//valorTotalImp2 = valorTotalImp2 - valorTotalImp3;
				valorTotalImp1 = (valorTotalImp1 - valorTotalImp2) * 0.08;
				valorTotalImp2 = valorTotalImp2 - valorTotalImp3;
				valorTotalImp2 = valorTotalImp2 * 0.18;	
				valorTotalImp3 = valorTotalImp3 * 0.28;
				
				valor = valorTotalImp1 + valorTotalImp2 + valorTotalImp3;
				System.out.println(valorTotalImp1);
				System.out.println(valorTotalImp2);
				System.out.println(valorTotalImp3);
			}
		
		System.out.printf("R$ %.2f",valor);
		
		sc.close();
	}

}
