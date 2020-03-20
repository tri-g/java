package conditions;
import java.util.Scanner;

public class leap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("enter the no");
		a=sc.nextInt();
		/**if((yr%4==0 && yr%100!=0) || (yr%400==0))
		{
			System.out.println(yr+" is a leap year");
		}
		else
		{
			System.out.println(yr+" not a leap year");
		}
	}**/
		
		if(a%2==0)
		{
			System.out.println("is even");
		}

		else
		{
			System.out.println("is odd");
		}
	}
}