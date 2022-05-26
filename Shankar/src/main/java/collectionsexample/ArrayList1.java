package collectionsexample;

import java.util.*;

public class ArrayList1 {
	
	public static void main(String[]args) {
		ArrayList <String> list = new ArrayList();
		list.add("Shanker");
		list.add("Ram");
		list.add("Amarnath");
		list.add("Ram");

		System.out.println(list);
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		for(String name:list) {
			System.out.println(name);
		}
		System.out.println(list.get(2));
	}

}
