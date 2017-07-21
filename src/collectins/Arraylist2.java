package collectins;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist2 {

	public static void main(String[] args) {
		Emp e1 = new Emp(222, "akhil");
		Emp e2 = new Emp(333, "venkat");
		Emp e3 = new Emp(111, "kiran");
		Emp e4 = new Emp(555, "madhu");
		Emp e5 = new Emp(444, "akhil");

		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(e1);
		al.add(e2);

		ArrayList<Emp> al1 = new ArrayList<Emp>();
		al1.addAll(al);
		al1.add(e3);
		al1.add(e4);
		al1.add(e5);
		al.removeAll(al1);
		System.out.println("before sorting");
		for (Emp e : al1) {
			System.out.println(e.eid + "----" + e.ename);
		}
		System.out.println("after sorting");
		Collections.sort(al1);
		for (Emp e : al1) {
			System.out.println(e.eid + "----" + e.ename);
		}
		

	}

}
