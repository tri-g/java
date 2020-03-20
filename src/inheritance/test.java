package inheritance;

public class test {
	public static void main(String[] args) {
		person e1=new student("tri","banh",22,121);
		student s=new student("tri","banh",22,121);
		System.out.println(s.name+" "+s.adress+" "+s.age+" "+s.stuid);
		s.action();
	parttime pt=new parttime("tri g","sydney",22,112,"data mining");
	System.out.println(pt.name+" "+pt.adress+" "+pt.age+" "+pt.stuid+" "+pt.course);
	System.out.println();
	
	pt.action();

	
	}
}
