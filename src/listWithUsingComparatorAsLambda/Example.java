package listWithUsingComparatorAsLambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class Emp
{
	int id;
	String name;
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
public class Example {

	public static void main(String[] args) {
		
		List<Emp> list=new ArrayList<>();
		list.add(new Emp(1,"Pranav"));
		list.add(new Emp(28,"Prabhat"));
		list.add(new Emp(10,"Pranav2"));
		list.add(new Emp(100,"Pranav6"));
		list.add(new Emp(14,"Pranav7"));
		
		Map<Integer,Emp> map=setInMap(list);
		
		for(Entry<Integer,Emp> emp1:map.entrySet())
		{
			System.out.println(emp1.getKey()+" "+emp1.getValue().name);
		}
		
		
		

	}

	public static Map<Integer, Emp> setInMap(List<Emp> list) {
		Map<Integer,Emp> map=new HashMap<>();
		for(int i=0;i<list.size();i++)
		{
			map.put(list.get(i).id, list.get(i));
		}
		
		return map;
	}

}
