package collectionsexample;

public class Book2 implements Comparable<Book2>{

	int id;
	String Name , Author, Publisher;
	int Quandity;
	
	public Book2(int id , String Name , String Author , String Publisher , int Quandity) {
		this.id=id;
		this.Name=Name;
		this.Author=Author;
		this.Publisher=Publisher;
		this.Quandity=Quandity;
	}
	public int compareTo (Book2 b){
	if(id>b.id) {
		return 1;
	}
	else if (id<b.id) {
		return -1;
	}
	else{
		return 0;
	}

}
}