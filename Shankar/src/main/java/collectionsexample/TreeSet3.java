package collectionsexample;
import java.util.*;
public class TreeSet3 {

	public static void main(String[] args) {
    TreeSet <Integer> s = new TreeSet<Integer>();
     s.add(12);
     s.add(34);
     s.add(65);
     s.add(0);
     System.out.println("Highest Value :"+s.pollLast());
     System.out.println("Lowest Value :"+s.pollFirst());
     System.out.println(s);
	}

}
