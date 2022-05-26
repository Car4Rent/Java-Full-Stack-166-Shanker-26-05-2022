package collectionsexample;

import java.util.LinkedHashSet;

public class LinkedHashSet4 {

	public static void main(String[] args) {
		LinkedHashSet <Book> s = new LinkedHashSet<Book>(); 
        Book b1 = new Book(101,"Let Us C","Yashwant kenetkar","BPB",8);
        Book b2 = new Book(102,"Data Comunication & NetWorking","Fouruzan","Mc Graw Hill",4);
        Book b3 = new Book(103, "Operating System","Galvin","Wiely",6);
        s.add(b1);
        s.add(b2);
        s.add(b3);
        for(Book b:s) {
        	System.out.println(b.id+" "+b.Name+" "+b.Author+" "+b.Publisher+" "+b.Quandity);
        }
	}

}
