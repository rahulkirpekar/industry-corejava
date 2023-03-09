package threadtopic;

public class MyThread extends Thread
{
	@Override
	public void run() 
	{
		if (Thread.currentThread().isDaemon()) 
		{
			System.out.println("Daemon thread - "+Thread.currentThread().getId() + " - " + Thread.currentThread().getName());
			
		} else 
		{
			System.out.println("Not Daemon thread - "+Thread.currentThread().getId() + " - " + Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) 
	{
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();
		MyThread thread3 = new MyThread();
		MyThread thread4 = new MyThread();
		MyThread thread5 = new MyThread();
		
		
		thread1.setName("Rahul");
		thread2.setName("Krunal ");
		thread3.setName("Ankur");
		thread4.setName("Sagar");
		thread5.setName("Amar");
		
		thread1.setPriority(MAX_PRIORITY);//10
		thread2.setPriority(MIN_PRIORITY);//1
		thread3.setPriority(NORM_PRIORITY);//5
		
		// Daemon - service Provider Thread
		thread1.setDaemon(true);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
	} 
}
