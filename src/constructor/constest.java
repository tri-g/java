package constructor;

public class constest {

	public static void main(String[] args) {
		cons c=new cons();
		
		System.out.println(c.name);
		System.out.println(c.address);
		System.out.println(c.age);
		System.out.println(c.phone);
		System.out.println();
		
		cons c1=new cons("jay","melbourne",23,67567854282l);
		System.out.println(c1.name);
		System.out.println(c1.address);
		System.out.println(c1.age);
		System.out.println(c1.phone);


	}

}
