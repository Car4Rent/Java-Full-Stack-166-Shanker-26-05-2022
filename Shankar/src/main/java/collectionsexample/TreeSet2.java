package collectionsexample;
import java.util.*;
public class TreeSet2 {

	public static void main(String[] args) {
		TreeSet <String> s = new TreeSet <String>();
		s.add("Ravi");
		s.add("Vijay");
		s.add("Ajay");
		Iterator i = s.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
