package collection1;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class test {
	public void nostream(List<stream1> l2)
	{
		List<Integer> l= new ArrayList<Integer>();
		List<String> l1=new ArrayList<String>();
		for(stream1 s:l2)
		{
			if(s.age>20)
			{
				l1.add(s.name);
				l.add(s.id);
			}
		}
		System.out.println(l1);
		System.out.println(l);

	}
	public void yestream(List<stream1> s1)
	{
		List<Integer> s2= s1.stream().filter(p->p.age>20).map(p->p.age).collect(Collectors.toList());
		System.out.println(s2);
	}
	public void streamiterating(List<stream1> s1) {
		Stream.iterate(1,ele->ele+1).filter(ele->ele%2==0).limit(10).forEach(System.out::println);
	}
	public void streamfiteringiterating(List<stream1> s1)
	{
		s1.stream().filter(p->p.age==22).forEach(p->System.out.println(p.name));
	}
	public void maxandmin(List<stream1> s1)
	{
		stream1 pa=s1.stream().max((p1,p2)->p1.age>p2.age?1:-1).get();
		System.out.println(pa.id);
		stream1 pa1=s1.stream().min((p1,p2)->p1.age>p2.age?1:-1).get();
		System.out.println(pa1.id);
	}
	public void count1(List<stream1> s1)
	{
		long count=s1.stream().filter(p->p.age>=22).count();
		System.out.println(count);
	}
	public void toset(List<stream1> s1)
	{
		Set<Integer> pa=s1.stream().filter(p->p.age<25).map(p->p.age).collect(Collectors.toSet());
		System.out.println(pa);
	}
	public void tomap(List<stream1> s1)
	{
		Map<Integer,String> pa=s1.stream().collect(Collectors.toMap(p->p.id,p->p.name));
		System.out.println(pa);
	}
	public void methodref(List<stream1> s1)
	{
		List<Integer> fa=s1.stream().filter(p->p.age>20).map(stream1::getAge).collect(Collectors.toList());
		System.out.println(fa);
	}
	
	public static void main(String[] args) {
		List<stream1> s1=new ArrayList<stream1>();
		s1.add(new stream1("tri",22,101,"bangalore"));
		s1.add(new stream1("jay",23,102,"bangalore"));
		s1.add(new stream1("ryan",20,103,"bangalore"));
		s1.add(new stream1("poo",24,104,"bangalore"));
		s1.add(new stream1("edna",25,105,"bangalore"));
		test t=new test();
		t.yestream(s1);
		//t.nostream(s1);
		//t.streamiterating(s1);
		//t.streamfiteringiterating(s1);
		//t.maxandmin(s1);
		//t.count1(s1);
		//t.toset(s1);
		//t.tomap(s1);
		t.methodref(s1);
	}

}
