package threadtopic.appthread;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Table resource = new Table();
		
		// 10 table display
		MyThread1 thread1 = new MyThread1(resource);
		
		// 20 table display
		MyThread2 thread2 = new MyThread2(resource);
		
		
		thread1.start();
		thread2.start();
		
		
		
	} 
}
