package stringnote;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder("Royal ");
		
		System.out.println(sb + " " + sb.hashCode());
		
		sb.append("Technosoft Pvt Ltd.");
		
		System.out.println(sb + " " + sb.hashCode());
		
		StringBuffer  name = new StringBuffer("ramesh");
		
		System.out.println(name.reverse());
		
	}
}
