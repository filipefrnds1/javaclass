

import java.util.Locale;
import java.util.Scanner;

public class Aula58Bitwise {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		int mask = 0b100000;// 0b significa que você vai indicar ao java que vai ser em formato binário
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		}else {
			System.out.println("6th bit is false!");
		}
		
		
		sc.close();
	}

}
