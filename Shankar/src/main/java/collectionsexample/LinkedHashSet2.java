package collectionsexample;
import java.util.*;
public class LinkedHashSet2 {

	public static void main(String[] args) {
		LinkedHashSet <String> s = new LinkedHashSet<String>();
		s.add("Ravi");
		s.add("Vijay");
		s.add("Ajay");
		s.add("Ravi");
		Iterator i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
