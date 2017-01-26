import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Time;




public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		MultiThread mthrd = new MultiThread("mthrd");
		mthrd.start();
		try {
			mthrd.join();
			System.out.println(Thread.currentThread());
		} catch (InterruptedException e) {
			System.out.println(e.toString());
		}
		System.out.println("main finished");
		
//		MultiThread.threadName();		
						
	}

}

