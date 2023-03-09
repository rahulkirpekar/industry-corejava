package collectiontopic;
import java.util.ArrayList;
import java.util.Iterator;
public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList<String>list = new ArrayList<String>();
		
		list.add("rahul");//0
		list.add("krunal");//1
		list.add("ankur");//2
		list.add("avadh");//3
		list.add("rakesh");//4
		list.add("sagar");//5

		System.out.println("list - "+list);

		
//		System.out.println(list.remove(1));
//		System.out.println(list.remove("krunal"));
		
		System.out.println("list - "+list);
		
//		System.out.println("list.size() : " + list.size());
//		for (int i = 0; i < list.size(); i++) 
//		{
//			System.out.println(list.get(i));
//		}
		

		
		
//		list.add(10);//<===itr
//		list.add(10.21345);//<===itr
//		list.add(true);
//		list.add("rahul");
//		list.add('R');
//		list.add(21345.213456f);
		
//		Iterator itr = 	list.iterator();
//		while(itr.hasNext()) 
//		{
//			Object obj = itr.next();
//			System.out.println(obj);
//		}
	}
}