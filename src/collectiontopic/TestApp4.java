package collectiontopic;
import java.util.TreeSet;
import java.util.Iterator;
public class TestApp4 
{
	public static void main(String[] args) 
	{
		// synchronized - ThreadSafe --- 
		TreeSet<String> setObject = new TreeSet<String>();
		setObject.add("rahul");
		setObject.add("krunal");
		setObject.add("brijesh");
		setObject.add("rakesh");
		setObject.add("sagar");
		setObject.add("rahul");
		setObject.add("amar");
		setObject.add("brijesh");
		setObject.add("sagar");
		Iterator<String> itr =	setObject.iterator();
		while(itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
		}
	}
}
