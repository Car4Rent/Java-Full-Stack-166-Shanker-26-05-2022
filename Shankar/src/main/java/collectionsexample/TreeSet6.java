package collectionsexample;

import java.util.TreeSet;

public class TreeSet6 {

	public static void main(String[] args) {
		TreeSet<Book2> book = new TreeSet<Book2>();
		Book2 b1 = new Book2(121,"Let US C","Yashwant Kanetkar","BPB",8);
		Book2 b2 = new Book2(223,"Operating System","Gaily","Wiely",6);
		Book2 b3 = new Book2(101,"Data Comunication & NetWorking","Fouruzan","MC Graw Hill",4);
		book.add(b1);
		book.add(b2);
		book.add(b3);
		for(Book2 b:book) {
			System.out.println(b.id+" "+b.Name+" "+b.Author+" "+b.Publisher+" "+b.Quandity);
		}
		

	}

}
