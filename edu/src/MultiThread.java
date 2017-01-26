//TODO реализовать запуск нескольких потоков.
public class MultiThread extends Thread {
	
	
	MultiThread(String name) {
		super(name);
		System.out.println("Thread " + Thread.currentThread().getName() + " finished");
		start();
	}
	
	public void run(){
		try 
		{
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}		
		
	}
		
	//возвращает имя/priority/group текущего потока
/**	public static void threadName() {
	Thread t = Thread.currentThread();
	System.out.println(t);
	}
**/	
	

}
