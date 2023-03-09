package iodemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObjectOutputStream 
{
	public static void main(String[] args) 
	{
		Student s  = new Student(1, "rahul kirpekar", 12);
		
		try 
		{
			FileOutputStream fout = new FileOutputStream("studetrecords.txt");

			ObjectOutputStream out = new ObjectOutputStream(fout);
		
			out.writeObject(s);
			
			out.close();
			
			fout.close();
			
			System.out.println("succes");
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
