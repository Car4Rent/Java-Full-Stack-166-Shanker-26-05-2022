package collectionsexample;

import java.util.HashSet;

public class HashSet3 {

	public static void main(String[] args) {
		HashSet <String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Arun");
        set.add("Sumit");
        System.out.println("An Initaial List Of Elements"+set);
        set.remove("Ravi");
        System.out.println("After Invoking Remove Method"+set);
        HashSet<String> s = new HashSet<String>();
        s.add("Gaurav");
        s.add("Ajay");
        set.addAll(s);
        System.out.println("Updated List"+set);
        set.removeAll(s);
        System.out.println("After Ivoking Remove All Method"+set);
        set.removeIf(str->str.contains("Vijay"));
        System.out.println("After Invoking RemoveIF Method"+ set);
        set.clear();
        System.out.println("After Invoking Clear Method"+set);
        
	}

}
