package collectionsexample;
import java.util.*;
public class Deque2 {

	public static void main(String[] args) {
		Deque <String> d= new ArrayDeque<String>();
        d.offer("Ravi");
        d.offer("Ajay");
        d.add("Amit");
        d.offerFirst("Jai");
        for(String str :d) {
        	System.out.println(str);
        }
        //d.poll();
        //d.pollFirst();
        d.pollLast();
        System.out.println("After PollLast");
        Iterator i = d.iterator();
        while(i.hasNext()) {
        	System.out.println(i.next());
        }
        
	}

}
