package collectins;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Book> set = new TreeSet<Book>();
		// Creating Books
		Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
		Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		// Adding Books to TreeSet
		set.add(b1);
		set.add(b2);
		set.add(b3);
		// Traversing TreeSet
		
		for (Book c : set) {
			System.out.println(c.id + " " + c.name + " " + c.author + " " + c.publisher + " " + c.quantity);
		}
	}

}
