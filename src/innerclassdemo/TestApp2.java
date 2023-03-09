package innerclassdemo;

public class TestApp2 
{
	// NestedClass--InnerClass
	static class Abc
	{
		void test() 
		{
			System.out.println("Abc - test()");
		}
	}
	public static void main(String[] args) 
	{
		TestApp2.Abc abcObj = new TestApp2.Abc();
		abcObj.test();
	}
}
