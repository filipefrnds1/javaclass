import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		// TODO Auto-generated method stub
			System.out.println("Ol� Mundo !");
			System.out.println("Bom dia!");
			System.out.println(y);
			System.out.println(x);
			System.out.printf("%.2f%n", x); // printf significa formatada,
			System.out.printf("%.4f%n", x);// %n quebra de linha, poderia ser \n
			Locale.setDefault(Locale.US); // %.2f significa duas casas decimais apos o .	
			//Obs: O v�rgula ap�s o 10 � o prinf por padr�o pega o formato 
			// que o computador est� usando, o idioma aqui do pc � portugu�s Brasil
			// para usar o ponto ao qual � o padr�o dos Estados Unidos usamos esse comando
			//Locale.setdefault
			System.out.printf("%.4f%n", x);
			
			//Concatena��o
			System.out.println("Resultado = " + y + " Metros");
			System.out.printf("Resultado = %.2f Metros%n", x);
			
			//Para Concatenar Varios elementos em um mesmo comando de escrita:
			//%f = ponto flutuante, %d = inteiro, %s = testo, %n = quebra de linha
			System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
