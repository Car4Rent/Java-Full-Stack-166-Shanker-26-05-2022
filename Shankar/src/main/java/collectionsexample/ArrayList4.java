package collectionsexample;
import java.util.*;

public class ArrayList4 {

	public static void main(String[] args) {
		
		ArrayList <String> list = new ArrayList <String>();
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");
        list.add("Grapes");
        
        for(String fruit :list)   {
        	System.out.println(fruit);
        }

	}

}
