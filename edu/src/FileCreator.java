/**Код должен создавать файл, имя - текущаяя дата и время. 
 * 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class FileCreator {
	
	public static String x =  null;
	//создает файл, где имя = текущие дата + время
	public static void  fileCreate() throws FileNotFoundException, IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yy HH_mm_ss");
		String filename = sdf.format(new Date()) + ".doc";
		String absolutePath = "/home/roman/git/edu/edu/logs";
		File file = new File(absolutePath, filename);		
		try {
			file.createNewFile();							
		} catch (IOException e) {
			e.printStackTrace();
		}
		PrintWriter out = new PrintWriter(file.getAbsoluteFile());
		try { 
			out.println("file created on " + sdf.format(new Date()));//здесь происходит запись в файл пременной x и даты создания имени файла
			out.println(Collections.createMap().toString());
		} finally {
			out.close();
		}				
	}
}
