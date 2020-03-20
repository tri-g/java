package functinter;

import java.util.function.Consumer;

public class ConsumerEg {
	public static String name(String s)
	{
		System.out.println("sup yall"+s);
		return "";
	}
	
	
	public static void main(String[] args) {
		/*Consumer<String> c=name->{ String s1="sup ";
		String s2=s1+name;
		System.out.println(s2);
		};
		c.accept("tri");*/
		Consumer<String> c=ConsumerEg::name;
		c.accept("tri");
		
		
	}
}
