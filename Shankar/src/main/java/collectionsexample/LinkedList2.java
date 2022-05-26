package collectionsexample;
import java.util.*;
public class LinkedList2 {

	public static void main(String[] args) {
		LinkedList <String> list = new LinkedList <String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		System.out.println("AfterInvoking add Method :"+list);
		list.add(1,"Gaurav");
		System.out.println(" After Inwoking Add method"+list);
		LinkedList <String> list2 = new LinkedList <String>();
		list2.add("Sonno");
		list2.add("Hanumat");
		list.addAll(list2);
		System.out.println("After Invoking Add all"+ list);
		LinkedList <String> list3 = new LinkedList <String> ();
		list3.add("Jhon");
		list3.add("Rahul");
        list.addAll(list3);
        System.out.println("After Invoking Add All Method:"+list);
        list.addFirst("Lokesh");
        System.out.println("After Invokin AddFirst Method :"+list);
        list.addLast("After Invoking Add Last Method :"+list);
        
	}

}
