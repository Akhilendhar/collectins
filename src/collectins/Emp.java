package collectins;

public class Emp implements Comparable<Emp>{
	int eid;
	String ename;
	Emp(int eid,String ename)
	{
		this.eid=eid;
		this.ename=ename;
				
	}
	@Override
	public int compareTo(Emp e) {
		return -ename.compareTo(e.ename);
		/*if(eid==e.eid)
		{
			return 0;
		}
		if(eid>e.eid)
		{
			return 1;
		}
		if(eid<e.eid)
		{
			return -1;
		}
		return eid;
		*/
	}
	

}
