package list;
import java.util.ArrayList;
import java.util.Collections;

public class SortinCollectionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l=new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("F");
		l.add("a");
		l.add("z");
		//l.add(new Integer(20));
		System.out.println(l);
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(l);
		

	}

}
