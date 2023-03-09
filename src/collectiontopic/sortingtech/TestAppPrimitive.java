package collectiontopic.sortingtech;

import java.util.ArrayList;
import java.util.Collections;

public class TestAppPrimitive
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		System.out.println(list);

		Collections.sort(list);
		
		System.out.println(list);
		
		
	}
}
