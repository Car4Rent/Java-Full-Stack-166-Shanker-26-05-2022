package collectionsexample;
import  java.util.*;
public class LinkedList3 {

	public static void main(String[] args) {
		LinkedList <String> list = new LinkedList <String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");
        list.add("Anuj");
        list.add("Gaurav");
        list.add("Harsh");
        list.add("Virat");
        list.add("Harsh");
        list.add("Amit");
        System.out.println("Intial List Of elements : "+list  );
        list.remove("Vijay");
        System.out.println("After Invoking remove Object Method"+list);
        list.remove(0);
        System.out.println("After Invoking Remove Index Method "+list);
        LinkedList <String> list2 = new LinkedList <String>();
        list2.add("Ravi");
        list2.add("Hanumat");
        list.addAll(list2);
        System.out.println("Updated List"+list);
        list.removeAll(list2);
        System.out.println("After Invoking Remove All"+list);
        list.removeFirst();
        System.out.println("After Invoking Remove First"+list);
        list.removeLast();
        System.out.println("After Invoking Remove Last Method"+list);
        list.removeFirstOccurrence("Gaurav");
        System.out.println("After Invoking RemoveFirstOccorence"+list);
        list.removeLastOccurrence("Harsh");
        System.out.println("After USing Remove Last Occorence Method"+list);
        list.clear();
        System.out.println("After Invoking Clear Method"+list);
        
        
        
	}   

}
