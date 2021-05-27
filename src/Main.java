import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		// TODO Auto-generated method stub
			System.out.println("Olá Mundo !");
			System.out.println("Bom dia!");
			System.out.println(y);
			System.out.println(x);
			System.out.printf("%.2f%n", x); // printf significa formatada,
			System.out.printf("%.4f%n", x);// %n quebra de linha, poderia ser \n
			Locale.setDefault(Locale.US); // %.2f significa duas casas decimais apos o .	
			//Obs: O vírgula após o 10 é o prinf por padrão pega o formato 
			// que o computador está usando, o idioma aqui do pc é português Brasil
			// para usar o ponto ao qual é o padrão dos Estados Unidos usamos esse comando
			//Locale.setdefault
			System.out.printf("%.4f%n", x);
			
			//Concatenação
			System.out.println("Resultado = " + y + " Metros");
			System.out.printf("Resultado = %.2f Metros%n", x);
			
			//Para Concatenar Varios elementos em um mesmo comando de escrita:
			//%f = ponto flutuante, %d = inteiro, %s = testo, %n = quebra de linha
			System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
