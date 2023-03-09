package threadtopic;

public class MyThread2 extends Thread
{
	public void run() 
	{
		for (int i = 1; i <=10; i++) 
		{
			try 
			{
				Thread.sleep(500);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
	public static void main(String[] args) 
	{
		MyThread2 t1 = new MyThread2();
		MyThread2 t2 = new MyThread2();
		MyThread2 t3 = new MyThread2();
		MyThread2 t4 = new MyThread2();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		
	}
}
