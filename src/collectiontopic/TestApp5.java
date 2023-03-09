package collectiontopic;

import java.util.TreeMap;
import java.util.Map;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer, String> mapObj  = new TreeMap<Integer,String>(); 
		mapObj.put(5, "krunal");//<----
		mapObj.put(1, "rahul kirpekar");
		mapObj.put(4, "Brijesh");
		mapObj.put(2, "Sameer");
		mapObj.put(3, "Mehul");
		
		for( Map.Entry e : mapObj.entrySet()) 
		{
			System.out.println(e.getKey() + " "+e.getValue());
		}
	}
}
