package collectionsexample;
import java.util.*;
public class LinkedList5 {

	public static void main(String[] args) {
		
		LinkedList<Book> list = new LinkedList<Book>();
        Book b1=new Book(101," Let Us C"," Yashwant Kanetkar "," BPB",8);
        Book b2=new Book(102," Data Comunication & Networking"," Foruozan"," MC Graw Hill",4);
        Book b3=new Book(103," Operating System"," Galvin"," Wiley",6);
        list.add(b1);
        list.add(b2);
        list.add(b3);
        
        for(Book b:list) {
        	System.out.println(b.id+b.Name+b.Author+b.Publisher+b.Quandity);
        }
        
	}

}
