//TODO реализовать запуск нескольких потоков.
public class MultiThread extends Thread {
	
	
	MultiThread(String name) {
		super(name);
		System.out.println("Thread " + Thread.currentThread().getName() + " running");		
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
	public static void threadName() {
	Thread t = Thread.currentThread();
	System.out.println(t);
	}
	
	

}
//вставлять в main, чтобы запускать потоки. 
//TODO разобраться с работой кода.

/**	MultiThread mthrd = new MultiThread("mthrd");
	mthrd.start();
	try {
		mthrd.join();
		System.out.println(mthrd);
	} catch (InterruptedException e) {
		System.out.println(e.toString());
	}
	System.out.println("main finished");
**/