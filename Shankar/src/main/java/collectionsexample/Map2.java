package collectionsexample;

import java.util.HashMap;
import java.util.Map;

public class Map2 {

	public static void main(String[] args) {
		Map <Integer,String> m = new HashMap<Integer,String>();
		m.put(1, "Ravi");
		m.put(2, "Vijay");
		m.put(3, "Ajay");
		m.put(4, "Harsh");
		m.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey())
		.forEach(System.out::println);
		
	}

}
