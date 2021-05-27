
public class Casting2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		int b;
		
		a = 5.0;
		//b = a; o compilador vai emitir um erro sobre perda de informação.
		// para resolver isso precisa avisar ao compilador que não se importa
		b = (int) a;
		
		System.out.println(b);
	}

}
