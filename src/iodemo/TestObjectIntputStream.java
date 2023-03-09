package iodemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestObjectIntputStream 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\industry-corejava\\studetrecords.txt");
		
			ObjectInputStream oin = new ObjectInputStream(fin);
		
			Student s = (Student)oin.readObject();

			System.out.println(s.getRno() + " "+ s.getName() + " " +s.getStd());
		
			oin.close();
			fin.close();
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}
