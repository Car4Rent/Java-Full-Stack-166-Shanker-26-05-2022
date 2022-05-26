package collectionsexample;

import java.util.LinkedHashSet;

public class LinkedHashSet3 {

	public static void main(String[] args) {
	   LinkedHashSet <String> s= new LinkedHashSet();
	   s.add("Java");
	   s.add("T");
	   s.add("Point");
	   s.add("Good");
	   s.add("Website");
	   System.out.println("The Hash Set Is"+s);
	   System.out.println(s.remove("Good"));
	   System.out.println("After Removing The Element"+s);
	   System.out.println(s.remove("For"));
			   

	}

}
