package collectionsexample;

import java.util.*;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList <String> list = new LinkedList <String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        
        Iterator i = list.iterator();
        while(i.hasNext()) {
        	System.out.println(i.next());
        }
	}

}
