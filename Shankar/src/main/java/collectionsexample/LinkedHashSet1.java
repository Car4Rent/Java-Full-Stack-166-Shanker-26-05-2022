package collectionsexample;
import java.util.*;
public class LinkedHashSet1 {

	public static void main(String[] args) {
		LinkedHashSet <String> s = new LinkedHashSet <String>();
        s.add("One");
        s.add("Two");
        s.add("Three");
        s.add("Four");
        s.add("Five");
        Iterator i = s.iterator();
        while(i.hasNext()) {
        	System.out.println(i.next());
        }
		
	}

}
