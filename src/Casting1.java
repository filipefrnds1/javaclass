
public class Casting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Casting é a conversão dos valores, ou seja, das variáveis
		int a = 5;
		int b = 2;
		
		double resultado;
		
		//resultado = 5 / 2;// ou seja, o compilador entende que 5/2 é uma divisão de inteiros
						  // por isso ele não divide como números flutuantes com casas decimais.
		resultado = (double) a / b;// força o compilador a reconhecer a divisão dos inteiros
									// como uma divisão de double
		
		System.out.println(resultado);
		
	}

}
