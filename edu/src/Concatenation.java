
//демонстрирует конкатенацию строк
public class Concatenation {
	public static void print(){
		String s = "hello";
		s = s.substring(0, 3) + "p!";
		System.out.println(s);
		String s1 = "HEL!";
		if (s.equalsIgnoreCase(s1)) { //сравнение игнорируя регистр
			System.out.println("equal");
		} else {
			System.out.println("no");
		}
		
	}	
}
