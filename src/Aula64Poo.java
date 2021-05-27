import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
//válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
//possui a maior área.
//A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a
//seguinte (fórmula de Heron):
// area = [p(p-a)(p-b)(p-c)]^(1/2)  onde p=(a+b+c)/2

public class Aula64Poo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		double a1,b1,c1,a2,b2,c2;
		double x,y,p1,p2;
		
		System.out.println("Enter the measures of triangle X: ");
		a1 = sc.nextDouble();
		b1 = sc.nextDouble();
		c1 = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle y: ");
		a2 = sc.nextDouble();
		b2 = sc.nextDouble();
		c2 = sc.nextDouble();
		
		
		p1 = (a1+b1+c1)/2;
		x = Math.sqrt((p1*(p1-a1)*(p1-b1)*(p1-c1)));
		
		p2 = (a2+b2+c2)/2;
		y = Math.sqrt((p2*(p2-a2)*(p2-b2)*(p2-c2)));
		
		System.out.println("Triangle X area: " + x);
		System.out.println("Triangle Y area: " + y);
		
		if(x > y) {
			System.out.println("Larger area: X");
		}else {
			System.out.println("Larger area: Y");
		}
		
		
		
		
		sc.close();
	}

}
