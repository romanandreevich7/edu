import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**TODO !!!Срочно запросить у кого нибудь комментарий по работе кода!
*нужно заставить сравнивать код введеное значение с перечислимыми типами...Будет рассмотрено 
*в главе 5 Хорстмана
**/


public class Grade  {
	
	public static enum Gradeling {
			A, B, C, D;

			public String toString() {
				switch (this) {
				case A:
					return "A";
				case B:
					return "B";
				case C:
					return "C";
				}
				return null;
			}
			
			public static Gradeling	value(Class<Gradeling> enumType, String value){
				if(value.equalsIgnoreCase(A.toString()))
					return Gradeling.A;
				if(value.equalsIgnoreCase(B.toString()))
					return Gradeling.B;
				if(value.equalsIgnoreCase(C.toString()))
					return Gradeling.C;
				else 
					return null;
			}
	}
	//этот метод выводит позицию переменной перичслимого типа.
	public static void print() {
		int position = Gradeling.B.ordinal();  
	System.out.println(position);
	}
}
