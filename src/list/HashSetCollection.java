package list;
import java.util.LinkedHashSet;

public class HashSetCollection {
	public static void main(String[] args)
	{
		LinkedHashSet hs=new LinkedHashSet();
		hs.add("q");
		hs.add("r");
		hs.add("A");
		hs.add("B");
		hs.add(1);
		System.out.println(hs);
		System.out.println(hs.add("q"));
		System.out.println(hs.add("H"));
		
	}

}
