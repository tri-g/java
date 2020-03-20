package inheritance;

public class student extends person {
	int stuid;
	public student(String n,String add, int age,int s)
	{
		super(n,add,age);
		stuid=s;
	}
	/*public student()
	{
		System.out.println("hi");
	}*/
public void action()
{
	System.out.println("Im the student variety");
}
}
