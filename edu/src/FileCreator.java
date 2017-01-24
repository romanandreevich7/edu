/**Код должен создавать файл, имя - текущаяя дата и время. 
 * 
 */

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class FileCreator {

	public static String[] fileCreate() {
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
		String absPath = file.getAbsolutePath();
		String[] fileInfo = new String [2];//содержит путь к и название  файлу.
		fileInfo [0] = absPath + "/" + filename;
		
		return fileInfo;		
	}

}
