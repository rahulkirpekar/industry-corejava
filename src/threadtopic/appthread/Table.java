package threadtopic.appthread;

public class Table 
{
	public void printTable(int no) 
	{
		// 1000 lines		
		synchronized (this) 
		{
			for (int i = 1; i <=10; i++) 
			{
				System.out.println(no + " * " + i + " = " + (no*i));
			}
		}
		// 1000 lines
	}
}
