package collectionsexample;
import java.util.*;

public class ArrayList7 {

	public static void main(String[] args) {
		
		Student s1 = new Student(101,"Ravi",23);
		Student s2 = new Student(102,"Ram",24);
		Student s3 = new Student(103,"Raju",25);
		
		ArrayList <Student> list = new  ArrayList <Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		Iterator i = list.iterator();
		while(i.hasNext()) {
			Student st =(Student)i.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
		
	}

}
