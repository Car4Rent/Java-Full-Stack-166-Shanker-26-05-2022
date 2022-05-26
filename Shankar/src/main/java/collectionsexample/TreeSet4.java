package collectionsexample;

import java.util.TreeSet;

public class TreeSet4 {

	public static void main(String[] args) {
		TreeSet <String> t = new TreeSet <String>();
        t.add("A");
        t.add("B");
        t.add("C");
        t.add("D");
        t.add("E");
        System.out.println("Intial List :"+t);
        System.out.println("Reverse Set :"+t.descendingSet());
        System.out.println("HeadSet :"+t.headSet("C",true));
        System.out.println("SubSet :"+t.subSet("A",false,"E",true));
        System.out.println("TailSet :"+t.tailSet("C",false));
	}

}
