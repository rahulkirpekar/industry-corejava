package innerclassdemo;

public class One 
{
	private int no1=10;
	void disp() 
	{
		// Local InnerClass
		class L
		{
			void getMsgOfL() 
			{
				System.out.println("No1 : " + no1);
			}
		}
		L obj = new L();
		obj.getMsgOfL();
	}

	public static void main(String[] args) 
	{
		One oneObj = new One();

		oneObj.disp();
	} 
}
