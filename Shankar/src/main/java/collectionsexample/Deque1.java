package collectionsexample;

import java.util.*;

public class Deque1 {

	public static void main(String[] args) {
	Deque <String> deque = new ArrayDeque <String>();	
    deque.add("Ravi");
    deque.add("Vijay");
    deque.add("Ajay");
    Iterator i = deque.iterator();
    while(i.hasNext()){
    	System.out.println(i.next());
    }
	}

}
