package hashMap;

import java.util.*;





public class HashMapImplementation<K, V> {

	private class Node {
		K key;
		V value;

		public Node(K key,V value) {
			this.key=key;
			this.value=value;

		}
	}
	private LinkedList<Node>[] buckets;
	int size;
	
	@SuppressWarnings("unchecked")
	public HashMapImplementation()
	{
		int n=0;
		int N=4;
		this.size=n;//size of map
		buckets=new LinkedList[N];//size of Array Of LinkedList
		
		for(int i=0;i<buckets.length;i++)
		{
			buckets[i]=new LinkedList<>();
		}
	}
private int searchinLL(K key, int bucketId) {
		
		LinkedList<Node> list = buckets[bucketId];
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)==key)
			{
				return i;
			}
		}
	
		return -1;
	}

	private int hashFunc(K key) {
		
		int val=key.hashCode();
		return Math.abs(val)%this.size;
	}
	
	public void put(K key,V value)
	{
		int bucketId=hashFunc(key);
		int findInLL=searchinLL(key,bucketId);
		
		if(findInLL!=-1)
		{
			Node node=buckets[bucketId].get(findInLL);
			node.value=value;
		}else
		{
			Node node =new Node(key,value);
			buckets[bucketId].add(node);
			size++;
		}
	}

	

}
