
public class Casting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Casting � a convers�o dos valores, ou seja, das vari�veis
		int a = 5;
		int b = 2;
		
		double resultado;
		
		//resultado = 5 / 2;// ou seja, o compilador entende que 5/2 � uma divis�o de inteiros
						  // por isso ele n�o divide como n�meros flutuantes com casas decimais.
		resultado = (double) a / b;// for�a o compilador a reconhecer a divis�o dos inteiros
									// como uma divis�o de double
		
		System.out.println(resultado);
		
	}

}
