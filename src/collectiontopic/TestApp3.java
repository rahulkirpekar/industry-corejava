package collectiontopic;

import java.util.ArrayList;
import java.util.Scanner;
// CRUD
/*
 * C-- Create/INSERT
 * R - Read
 * U - Update
 * D - Delete
 * */
public class TestApp3 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> list = new ArrayList<Student>();
		int choice =0,i;
		Student s = null;
	while(choice!=5) 
	{	
		System.out.println("Enter below choice : ");
		System.out.println("1) For Insert Student Record");
		System.out.println("2) For Update Student Record");
		System.out.println("3) For Delete Student Record");
		System.out.println("4) For Display All  Student Records");
		System.out.println("5) For Application Exit");
		choice = new Scanner(System.in).nextInt();
		Scanner sc = new Scanner(System.in);
		switch (choice) 
		{
			case 1: s = new Student();
					s.scan();
					list.add(s);
					System.out.println("Student records successfully Inserted.");
					break;
			case 2: 
					System.out.println("Enter Rno which Student record you want to Update : ");
					int updateRno = sc.nextInt();
					boolean flag = false;
					for (i = 0; i < list.size(); i++) 
					{
						s = list.get(i);
						if(updateRno==s.getRno()) 
						{
							flag=true;
							break;
						}
					}
					if (flag) 
					{
						s.update();
						list.set(i, s);
						System.out.println("Student record successfully Updated");
					} else 
					{
						System.out.println("Student rno not found in Records");
					}
					break;
			case 3: System.out.println("Enter Rno which Student record you want to Remove : ");
					int deleteRno = sc.nextInt();
					flag = false;
					for (i = 0; i < list.size(); i++) 
					{
						s = list.get(i);
						if(deleteRno==s.getRno()) 
						{
							flag=true;
							break;
						}
					}
					if (flag) 
					{
						list.remove(i);
						System.out.println("Student record successfully removed");
					} else 
					{
						System.out.println("Student rno not found in Records");
					}
					break;
			case 4: System.out.println("Rno\tName\tStd");
					for(i=0;i<list.size();i++) 
					{
						s  = list.get(i);
						s.disp();
					}
					break;
			case 5:System.out.println("Application exited");
					System.exit(0);
					break;
			default: System.out.println("Invalid Choice,\n\t Please enter between 1 to 5 choice.");
					break;
		}
	  }	
	}
}
