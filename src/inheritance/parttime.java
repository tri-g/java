package inheritance;

public class parttime extends student {
	String course;
	public parttime(String n,String add, int age,int s,String course)
	{
		super(n,add,age,s);
		this.course=course;
	}
	public void action()
	{
		System.out.println("and i study part time in data mining topic");
	}

}
