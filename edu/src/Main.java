import java.io.FileNotFoundException;
import java.io.IOException;




public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Collections.createMap();	
		Algorithms.compare();
		FileCreator.fileCreate();		 
						
	}

}
