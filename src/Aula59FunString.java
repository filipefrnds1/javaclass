import java.util.Locale;
import java.util.Scanner;

public class Aula59FunString {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		String s01 = original.toLowerCase();// imprimi toda a String com letras minúsculas !
		String s02 = original.toUpperCase();// imprimi toda a String com letras maiúsculas !
		String s03 = original.trim();// elimina os espaços nos cantos das Strings !
		String s04 = original.substring(2);// vai pegar somente o caracter da string da posição 2 em diante.
		String s05 = original.substring(2, 9);//vai pegar somente a string entre a posição 2 até 9
		String s06 = original.replace('a', 'x');//Troca os caracteres 'a' pelo 'x' na string!
		String s07 = original.replace("abc", "xy");//Troca uma substring por outra substring!
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original " + original + "-");
		System.out.println("toLoweCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: " + s03 + "-");
		System.out.println("substring(2): " + s04 + "-");
		System.out.println("substring(2,9): " + s05 + "-");
		System.out.println("replace('a', 'x'): " + s06 + "-");
		System.out.println("replace('abc', 'xy'): " + s07 + "-");
		System.out.println("Index of 'bc': " + i + "-");
		System.out.println("last Index of 'bc': " + j + "-");
		
		
		sc.close();
	}

}
