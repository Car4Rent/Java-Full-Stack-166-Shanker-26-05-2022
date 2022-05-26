package collectionsexample;

import java.util.*;

public class Deque3 {

	public static void main(String[] args) {
		Deque<Book> d = new ArrayDeque<Book>();
		Book b1 = new Book(101,"Let Us C","Yashwant Kenetkar","BPB",8);
		Book b2 = new Book(102,"Data Comunication And Networking","Forozan","MC Graw Hill",6);
		Book b3 = new Book(103,"Operating System","Galvin","Wiely",4);
		d.add(b1);
		d.add(b2);
		d.add(b3);
		for(Book b:d) {
			System.out.println(b.id+" "+b.Name+" "+b.Author+" "+b.Publisher+" "+b.Quandity);
		}
		
		
	}

}
