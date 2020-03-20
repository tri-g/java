package functinter;

import java.util.function.BiFunction;

public class BiFunctional {
	public static String con(String s1,String s2)
	{
		String s3=s1+s2;
		return s3;
	}
	/*public static int sub(int a,int b)
	{
		int c=a+b;
		return c;
	}*/                                                                   
	public static void main(String[] args) {
		BiFunction<String,String,String> q=BiFunctional::con;
		System.out.println(q.apply("Triveni ", "G"));
		BiFunction<Integer,Integer,Integer> q1=(a,b)->(a-b);
		System.out.println(q1.apply(20, 20));
		
		
		
	}

}
