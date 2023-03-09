package stringnote;

import java.util.Scanner;

// string methods
public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc   = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.nextLine();// single word + multiple words
		
		boolean flag = true;

		for(int i=0,j=(name.length()-1) ; i < name.length() ; i++,j--)
		{
			if(name.charAt(i) != name.charAt(j))
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Name is Palindrome: " + name);
		}else
		{
			System.out.println("Name is not Palindrome: " + name);
		}
		
		
		
//		String name = sc.next();// single word
		
//		System.out.println("name.length() - " + name.length());
		
//		for (int i = 0; i < name.length(); i++) 
//		{
//			System.out.println("name.charAt("+i+") --- " + name.charAt(i));
//		}
	}
}
