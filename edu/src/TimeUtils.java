//TODO реализовать сравнение даты больше/меньше.

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TimeUtils {
	
	//Задает формат времени
	public static SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	
	//возвращает текущее на момент запроса время.	
	public static String realTime() {		
		String realTime = sdf.format(new Date());
		return realTime;
	}
	
	//если заданное время dtf и текущее realTime() сопадают, выводит в консоль сообщение о запуске. 
	public static void launchTimer() {		
		String setTime = "12:49:10";
		System.out.println(sdf.format(new Date()));
		boolean x = false;
		while (x==false) {
			if (setTime.equals(realTime())) {
			x = true;	
			}
		}
		System.out.println ("Started at " + realTime());
	}	
	//сравнивает даты
	public static void compareTime() throws ParseException {
		DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		Date date1 = format.parse("02.12.1950");
		Date date2 = format.parse("09.03.1969");
		if (date1.getTime()>date2.getTime()) {
			System.out.println("false");			
		} else {
			System.out.println("right");
		}		
	}
}
