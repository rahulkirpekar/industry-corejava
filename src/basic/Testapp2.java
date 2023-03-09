package basic;

import java.util.Scanner;

public class Testapp2 
{
	final int no2 ;
	
	public Testapp2() 
	{
		no2=20;
	}
	public Testapp2(int value) 
	{
		no2 = value;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No : ");
		int value = sc.nextInt();
		
		Testapp2 obj = new  Testapp2(value);
		System.out.println("---> "+obj.no2);		
	}
}