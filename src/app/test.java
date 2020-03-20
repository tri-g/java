package app;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		int ch=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username");
		String uname=sc.next();
		System.out.println("Enter your password");
		String pw=sc.next();
		Login l=new Login();
		l.login(uname);
		System.out.println();
		System.out.println("1. List the records\n"+"2. Add a new record\n"+"3. Update an existing record\n"+"4. Show my date of birth\n"+"5. Exit\n");
		System.out.println("Please enter your choice");
		ch=sc.nextInt();
		do {
		switch(ch)
		{
		case 1: Case1 c=new Case1();
		c.case1();
		break;
		case 2: Case2 c1=new Case2();
		c1.case2();
		break;
		case 3: Case3 c2=new Case3();
		c2.case3(uname);
		break;
		case 4: Case4 c4=new Case4();
		c4.case4(uname);
		break;
		case 5:Login l1=new Login();
		l1.login(uname);
		break;
		}
		}
		while(ch!=0);
	}

}
