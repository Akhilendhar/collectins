package collectins;

import java.util.LinkedList;

public class Linkedlisttest {

	public static void main(String[] args) {
		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
		LinkedList<Book> lt = new LinkedList<Book>();
		lt.add(b1);
		lt.add(b2);
		lt.add(b3);
		for (Book b : lt) {
			System.out.println(b.id + "---" + b.author + "----" + b.name + "---" + b.publisher + "-----" );
		}

	}

}
