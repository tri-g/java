package inheritance;

public abstract class person {
	String name;
	String adress;
	int age;
	 public person(String n,String ad, int a)
	 {
		 name=n;
		 adress=ad;
		 age=a;
	 }
	/*public person()
	{
		System.out.println("hello!");
	}*/
	 public abstract void action();
	 
} 
		 //System.out.println("there are varieties in people");
	
