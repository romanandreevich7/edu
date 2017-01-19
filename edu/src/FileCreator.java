/**Код должен создавать файл, имя - текущаяя дата и время. 
 * 
 */

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class FileCreator {
	
public enum Grade {
	A, B, C, D, Incomplete
}

	
final static String s1 = "s"; //финализированная переменная

	public static String fileCreate() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yy HH_mm_ss");
		String filename = sdf.format(new Date()) + ".doc";
		String absolutePath = "/home/roman/git/edu/edu/logs";
		File file = new File(absolutePath, filename);
		try {
			file.createNewFile();			
		} catch (IOException e) {
			e.printStackTrace();
		}
		String s = file.getName();
		return s;
	}

}
