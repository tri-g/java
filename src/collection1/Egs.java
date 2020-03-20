package collection1;

import java.util.*;

public class Egs {
	/*public void arraymethod() {
		HashSet hs=new HashSet();
		hs.add("tri");
		hs.add(null);
		hs.add("edna");
		hs.add("hema");
		hs.add("tri");
		hs.add(null);
		hs.add("poo");
		System.out.println(hs);
	}*/
	/*public void treemethod() {
		TreeSet ts=new TreeSet();
		ts.add("tri");
		ts.add("edna");
		ts.add("hema");
		ts.add("tri");
		ts.add("poo");
		Iterator itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	*/
	/*public void listexample() {
		List ls=new ArrayList();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		ls.add(null);
		ls.add(1,6);
		System.out.println("the element is 2nd position is"+ls.get(2));
		Iterator itr=ls.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}*/
	public void queuemethod() {
		Queue q=new PriorityQueue();
		q.add("amit");
		q.add("vijay");
		q.add("karan");
		q.add("rai");
		q.add("rahul");
		System.out.println(q);
		System.out.println("head element "+q.element());
		System.out.println("peek "+q.peek());
		System.out.println(q);
		System.out.println("remove "+q.remove());
		System.out.println("poll "+q.poll());
		System.out.println(q);
	}
	/*
	public void linkedlist()
	{
		LinkedList ll=new LinkedList();
		ll.add('a');
		ll.add('r');
		ll.add('d');
		ll.add('x');
		ll.add(3,'c');
		ll.add(null);
		Iterator itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(ll);
	}
	
	public void vectorex()
	{
		Vector v=new Vector();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(null);
		v.add(3,7);
		System.out.println(v);
		
	}
	public void stackeg()
	{
		Stack st=new Stack();
		st.push("tri");
		st.add("jay");
		st.add("ryan");
		st.add("poo");
		st.pop();
		System.out.println(st);
	}
	
	public void mapeg()
	{
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(1,"tri");
		m.put(3,"ryan");
		m.put(2,"jay");
		
		System.out.println(m);
		for(Map.Entry ma:m.entrySet())
		{
			System.out.println(ma.getKey());
			System.out.println(ma.getValue());
		}
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		Egs e=new Egs();
		//e.arraymethod();
		//e.treemethod();
		//e.listexample();
		e.queuemethod();
		//e.linkedlist();
		//e.vectorex();
		//e.stackeg();
		//e.mapeg();
	}

}
