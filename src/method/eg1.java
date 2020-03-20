package method;

public class eg1 {

	public static void main(String[] args) {
		eg o=new eg();
		int x,y;
		o.x=10;
		o.y=20;
	
		/*int q=o.mul();
		System.out.println(q);
		System.out.println(o.div(12, 4));*/
		o.sum();
		int q=o.sum(10,20,78,96,43);
		System.out.println(q);
		String w=o.sum("hi"," world!!"," sup"," yall");
		System.out.println(w);
		float q1=o.sum(12.4f, 45.6f);
		System.out.println(q1);
		System.out.println(o.sum(34,56));
		System.out.println(o.sum("Jay"," Ryan"));

	}

}
