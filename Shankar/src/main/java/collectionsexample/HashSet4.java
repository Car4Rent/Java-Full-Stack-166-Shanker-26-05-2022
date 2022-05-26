package collectionsexample;

import java.util.*;

public class HashSet4 {

	public static void main(String[] args) {
		ArrayList <String> list = new ArrayList <String>();
		list.add("Harsh");
		list.add("Ravi");
		list.add("Ajay");
		
		HashSet <String> set = new HashSet <String>(list);
		set.add("Gaurav");
		Iterator i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
