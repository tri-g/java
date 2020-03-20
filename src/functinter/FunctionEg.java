package functinter;

import java.util.function.Function;

public class FunctionEg {
	public static int add(int b)
	{
		int c=10+b;
		return c;
	}
	public static int mul(int b)
	{
		int d=20*b;
		return d;
	}

	public static void main(String[] args) {
		Function<Integer,Integer> f=FunctionEg::add;
		System.out.println(f.apply(20));
		Function<Integer,Integer> f1=FunctionEg::mul;
		System.out.println(f1.apply(20));
		
		
		
		
		
	}

}
