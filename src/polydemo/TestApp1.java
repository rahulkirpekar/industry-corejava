package polydemo;
import java.util.Scanner;
public class TestApp1 
{
//	Method Overloadding	--- CompileTime Polymorphism
	void addFun() 
	{
		System.out.println("START - addFun() ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		int ans = no1+no2;
		System.out.println("Addition : " + ans);
	}
	void addFun(int no1) 
	{
		System.out.println("START - addFun(int no1) ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		int ans = no1+no2;
		System.out.println("Addition : " + ans);
	}
	void addFun(int no1,int no2) 
	{
		System.out.println("START - addFun(int no1,int no2) ");

		int ans = no1+no2;
		System.out.println("Addition : " + ans);
	}
	void addFun(float no1,float no2) 
	{
		System.out.println("double---START - addFun(int no1,int no2) ");
		double ans = no1+no2;
		System.out.println("Addition : " + ans);
	}
	public static void main(String[] args) 
	{
		TestApp1 obj = new TestApp1();
		Scanner sc = new Scanner(System.in);
		obj.addFun();
		// other code ---1 value generate
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		obj.addFun(no1);
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		obj.addFun(no1,no2);
		obj.addFun(10.1324f,453.123456f);
	}
}
