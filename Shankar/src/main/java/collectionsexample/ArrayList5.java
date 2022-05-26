package collectionsexample;
import java.util.*;

public class ArrayList5 {

	public static void main(String[] args) {
		
    ArrayList  <String> list = new ArrayList <String>();
    list.add("Apple");
    list.add("Mango");
    list.add("Banana");
    list.add("Grapes");
    System.out.println("Retunrning element : "+list.get(1));
    list.set(1, "Dates");
    
    for(String fruit:list){
    	
    	System.out.println(fruit);
    	
    }
	}

}
