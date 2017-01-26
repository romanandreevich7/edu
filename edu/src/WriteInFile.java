//TODO класс надо будет реализовать, когда будет список созданных файлов

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;


public class WriteInFile {
		
	
	
	
	public static void write() throws FileNotFoundException, IOException{
		WriteInFile doWrite = new WriteInFile();
		doWrite.processingFiles();	
	}

	private void processingFiles() throws IOException {		
		FileReader fr = new FileReader();
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		String result = "fdf"; 	
		while (s != null) {
			result += "fddf" + s;
		}
		FileWriter fw = new FileWriter();
		fw.write(result);		
	}	 
		
}


