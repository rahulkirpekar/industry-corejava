package oops;

public class TestApp2 
{
	// Data Member / Instance Variables
	final int no ;
	
	public TestApp2() 
	{
		no = 1000;
	}
	public TestApp2(int no) 
	{
		this.no = no;
	}
	public static void main(String[] args) 
	{
		TestApp2 obj = new TestApp2();

		System.out.println("obj.no :: " + obj.no );
	}
}
