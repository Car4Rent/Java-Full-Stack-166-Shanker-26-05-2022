package collectionsexample;
import java.util.*;
public class HashSet5 {

	public static void main(String[] args) {
		HashSet<Book1> s = new HashSet <Book1> ();
        Book1 b1 = new Book1(101,"Let Us C","Yashwant Kanetkar", "BPB",8);
        Book1 b2 = new Book1(102,"Data COmunications And NetWorking","Forouzan","MC Graw Hill",4);
        Book1 b3 = new Book1(103,"Operating System","Galvin","Wiley",6);
        s.add(b1);
        s.add(b2);
        s.add(b3);
        for(Book1 b:s) {
        	System.out.println(b.Id+" "+b.Name+" " +b.Author+" "+ b.Publisher+" "+b.Quandity);
        }
	}

}
