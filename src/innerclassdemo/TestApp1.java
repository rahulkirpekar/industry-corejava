package innerclassdemo;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Animal --- Annoummous InnerClass
		Animal animal = new Animal() 
		{
			public void eat() 
			{
				System.out.println("Animal Inner eat()");
			}
		};

		animal.eat();
	}
}
