package collectionsexample;
import java.util.*;
public class ArrayList6 {

	public static void main(String[] args) {
		ArrayList <String> list= new ArrayList <String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        Collections.sort(list);
        for(String fruits:list) {
        	System.out.println(fruits);
        }
        ArrayList <Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        Collections.sort(list2);
        for(Integer numbers:list2) {
        	System.out.println(numbers);
        }
	}

}
