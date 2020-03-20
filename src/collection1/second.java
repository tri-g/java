package collection1;


import java.util.*;

public class second {

	public static void main(String[] args) {
		first f=new first();
		first f1=new first();
		List<first> l=new ArrayList<first>();
		l.add(f);
		l.add(f1);
		Scanner sc=new Scanner(System.in);
		for(first s:l)
		{
			System.out.println("enter the name");
			s.name=sc.next();
			System.out.println("enter the age");
			s.age=sc.nextInt();
			System.out.println("enter the id");
			s.id=sc.nextInt();
		}
		for(first s:l)
		{
			System.out.println(s.name);
			System.out.println(s.age);
			System.out.println(s.id);
		}
			
		

	}

}
