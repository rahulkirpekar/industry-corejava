package exceptiondemo;

import java.io.IOException;
import java.util.Scanner;

public class TestAppp3 
{
	public static void isValidForVote(int age) throws InvalidAgeException , ArithmeticException
	{
		if(age < 18) 
		{
			// raise Exception
			throw new InvalidAgeException("\n\t\"Invalid for Vote,\n\t\tPlease enter greater than 18 for Vote\"");
		}else 
		{
			System.out.println("Welcome for Vote");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		try 
		{
			isValidForVote(age);
		} catch (InvalidAgeException e) 
		{
			e.printStackTrace();
		}
		System.out.println("after catch --main method");	
	}	
}
