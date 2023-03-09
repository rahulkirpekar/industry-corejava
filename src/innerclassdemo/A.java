package innerclassdemo;

public class A 
{
	private int no=10;
	// Member InnerClass
	class B
	{
		void disp() 
		{
			System.out.println("No : " + no);
		}
	}
	public static void main(String[] args) 
	{
		A outer = new A();
		
		A.B inner = outer. new B();

		inner.disp();
		
	}
}
