package collectionsexample;
import java.util.*;
public class Queue1 {

	public static void main(String[] args) {
		Queue <String> queue = new PriorityQueue <String>();
		queue.add("Ravi");
		queue.add("Vijay");
		queue.add("Amit");
		Iterator i = queue.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			
		}
		queue.remove();
		queue.poll();
		System.out.println("After Removing Two Elements");
		Iterator itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
