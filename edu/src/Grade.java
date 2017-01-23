import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**TODO !!!Срочно запросить у кого нибудь комментарий по работе кода!
*нужно заставить сравнивать код введеное значение с перечислимыми типами...Будет рассмотрено 
*в главе 5 Хорстмана
**/


public class Grade  {
	
	public static enum gradeling {
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
			
			public static gradeling	value(Class<gradeling> enumType, String value){
				if(value.equalsIgnoreCase(A.toString()))
					return gradeling.A;
				if(value.equalsIgnoreCase(B.toString()))
					return gradeling.B;
				if(value.equalsIgnoreCase(C.toString()))
					return gradeling.C;
				else 
					return null;
			}
	}	
		
	public static String arg1 (){
			String a = "A";
			return a;
	}
		
	public static void print() {
			
		//код сравнивает значение из метода arg1 и конкретную константу enum				
		if(arg1().equals(gradeling.A.toString())) {
			System.out.println("eq");
		} else {
			System.out.println("noneq");
		}
		
		//этот код выводит позицию переменной перичислимого типа.		
		int position = gradeling.A.ordinal();  
		System.out.println(position);
	}
}

