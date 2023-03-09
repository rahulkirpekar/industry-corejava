package iodemo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestFileWriter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();

		FileWriter fw;
		try 
		{
			fw = new FileWriter("test1.txt");
			fw.write(name);
		
			fw.close();
		
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		
	}
}
