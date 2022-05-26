package collectionsexample;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet <String> s = new TreeSet <String>();
		s.add("Ravi");
		s.add("Vijay");
		s.add("Ravi");
		s.add("Ajay");
		Iterator i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
