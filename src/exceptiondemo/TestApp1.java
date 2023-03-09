package exceptiondemo;

import java.io.IOException;
import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];

		try 
		{
			// exception code----
			try 
			{
				a[5] = 100;//java.lang.ArrayIndexOutOfBoundsException:
				System.out.println(a[4]);
				
			} catch (Exception e) 
			{
				System.out.println("nested catch1---catch block Hanlded Exception");
				e.printStackTrace();
			}

			try 
			{
				String name = "rahul";
				System.out.println(name.charAt(10));//java.lang.StringIndexOutOfBoundsException
			} catch (Exception e) 
			{
				System.out.println("nested catch2---catch block Hanlded Exception");

				e.printStackTrace();
			}
		
			try 
			{
				String value = "f8f9f09w0";
				int no = Integer.parseInt(value);//java.lang.NumberFormatException:
				no = no + 200;
				System.out.println(value);

			} catch (Exception e) 
			{
				System.out.println("nested catch3---catch block Hanlded Exception");

				e.printStackTrace();
			}		
		}catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("ArrayIndexOutOfBoundsException---catch block---Exception Handled");
		}catch(StringIndexOutOfBoundsException e) 
		{
			System.out.println("StringIndexOutOfBoundsException---catch block---Exception Handled");
		}catch(Exception e) 
		{
			System.out.println("Exception---catch block---Exception Handled");
			// errorLog
			e.printStackTrace();
		}
		System.out.println("hello");
//		
		
		
//		String name = null;
//		System.out.println("name.length() -- " + name.length());//java.lang.NullPointerException
		
		
//		Scanner sc  = new Scanner(System.in);
//		int no1,no2,ans;
//		System.out.println("Enter No1 : ");
//		no1 = sc.nextInt();
//		System.out.println("Enter No2 : ");
//		no2 = sc.nextInt();
		
//		ans = no1/no2;
//		System.out.println("Division : " + ans);
		
	}
}
