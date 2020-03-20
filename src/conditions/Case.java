package conditions;

import java.util.Scanner;

public class Case {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float a,b;
		int op;
		System.out.println("enter the no");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("1. addition "
				+ "2. subtraction "
				+ "3. multiplication "
				+ "4. division");
		op=sc.nextInt();
		switch(op)
		{
		case 1 : System.out.println(a+b);
		           break;
		case 2 : System.out.println(a-b);
        break;  
		case 3 : System.out.println(a*b);
        break;
		case 4 : System.out.println(a/b);
        break;
        default:
        	System.out.println("invalid");
		        
		}
	}

}
