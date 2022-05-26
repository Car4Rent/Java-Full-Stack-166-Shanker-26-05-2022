package collectionsexample;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {
		Map <Integer,String> map = new HashMap <Integer,String>();
		map.put(1, "Amit");
		map.put(2, "Vijay");
		map.put(5, "Ajay");
		map.put(6, "Ravi");
       for(Map.Entry m:map.entrySet()) {
    	   System.out.println(m.getKey()+" "+m.getValue());
       }
	}

}
