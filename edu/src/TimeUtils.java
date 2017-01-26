import java.text.SimpleDateFormat;
import java.util.Date;


public class TimeUtils {
	
	//возвращает текущее на момент запроса время.	
	public static String realTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String realTime = sdf.format(new Date());
		Collections.createMap().put(realTime, "real time requested");
		return realTime;
	}
	
	//если заданное время dtf и текущее realTime() сопадают, выводит в консоль сообщение о запуске. 
	public static void launchTimer() {
		SimpleDateFormat dtf = new SimpleDateFormat("HH:mm:ss");
		String setTime = "12:49:10";
		System.out.println(dtf.format(new Date()));
		boolean x = false;
		while (x==false) {
			if (setTime.equals(realTime())) {
			x = true;	
			}
		}
		System.out.println ("Started at " + realTime());
	}
}
