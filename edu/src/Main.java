import java.io.FileNotFoundException;
import java.io.IOException;




public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		TimeUtils.launchTimer();
		Collections.createMap1();	
		Algorithms.compare();
		FileCreator.fileCreate();		 
						
	}

}
