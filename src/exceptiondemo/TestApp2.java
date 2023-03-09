package exceptiondemo;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		try 
		{
			int ans = 10/0;
		} catch (Exception e) 
		{
			System.out.println("Exception Hanlded");
			e.printStackTrace();
		}finally 
		{
			System.out.println("Finally Block");
		}
		System.out.println("after exception handling");
		
	}

}
