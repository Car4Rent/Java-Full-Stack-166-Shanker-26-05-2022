package collectionsexample;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Map3 {

	public static void main(String[] args) {
		Map <Integer,String> map= new HashMap <Integer,String>();
		map.put(1, "Ajay");
		map.put(2, "Vijay");
		map.put(3, "Rahul");
		map.entrySet()
		.stream()
//		.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))  
//	      //Performs an action for each element of this stream  
//	      .forEach(System.out::println);  
//		
//		
		.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);

	}

}
