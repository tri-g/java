package loops;
import java.util.Scanner;
public class wta {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name="";
		
		name=sc.nextLine();
		
		System.out.println("enter age");
		int age=sc.nextInt();
		System.out.println("enter address");
		String add=sc.next();
		System.out.println("hi! my name is "+name+" .Im "+age+" years old. I live in "+add+".");
		

	}

}
