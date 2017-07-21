package collectins;

import java.util.HashSet;

public class Hashset1 {

	public static void main(String[] args) {
		HashSet<String> ha=new HashSet<String>();
		ha.add("akhil");
		ha.add("venkat");
		ha.add("kiran");
		ha.add("madhu");
		ha.add("akhil");
		ha.add("null");
		for(String s:ha)
		{
			System.out.println(ha);
		}
		java.util.Iterator<String> itr=ha.iterator(); 
		while(itr.hasNext()){  
			System.out.println(itr.next());  
			} 
		// TODO Auto-generated method stub

	}

}
