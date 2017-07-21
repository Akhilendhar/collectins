package collectins;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(1);
		l.add(1.4);
		l.add("a");
		l.add("akhil");
		l.add("akhil");
		l.add("null");
		Integer i = new Integer(20);
		l.add(i);

		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		l.add(2, "a");
		System.out.println(l);
		l.add('q');
		System.out.println(l);
		int a = l.size();
		System.out.println(a);
		int b = l.hashCode();
		System.out.println(b);
		/*
		 * l.clear(); System.out.println(l);
		 */
		boolean atrue = l.contains('q');
		System.out.println(atrue);
		System.out.println(l.get(2));
		l.remove(i);
		System.out.println(l);
		
	}

}
