package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterateOverKeysAndValuesInMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map=new HashMap<>();
		map.put("Pranav Kumar", 12);
		map.put("Prabhat Kumar", 121);
		map.put("Pr Kumar", 192);
		map.put("Pran Kumar", 102);
		map.put("Prav Kumar", 172);
		
		
		Iterator<String> iterator = map.keySet().iterator();
		Iterator<Integer> iterator2 = map.values().iterator();
		
		Iterator<Entry<String, Integer>> iterator3 = map.entrySet().iterator();
		
		while(iterator3.hasNext())
		{
			System.out.println(iterator3.next());
		}
		
		
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		while(iterator2.hasNext())
		{
			System.out.println(iterator2.next());
		}

	}

}
