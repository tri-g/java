package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Case3 {
	public void case3(String uname)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?useSSL=false", "root",
					"1234");
			Statement st = con.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("DOB\n email\nphone\nadd\n");
			String c=sc.next();
			switch(c)
			{
			case "DOB":System.out.println("enter the dob");
			String dob=sc.next();
				String query = "update empdetails set DOB='"+dob+"' where name='"+uname+"'";
			st.executeUpdate(query);
			System.out.println("one record updated");
			break;
			
			case "email":System.out.println("enter the email");
			String email=sc.next();
				String query1 = "update empdetails set email='"+email+"' where name='"+uname+"'"; 
			st.executeUpdate(query1);
			System.out.println("one record updated");
			break;
			
			case "phone":System.out.println("enter the phone");
			Long phone=sc.nextLong();
				String query2 = "update empdetails set phone='"+phone+"' where name='"+uname+"'";
			st.executeUpdate(query2);
			System.out.println("one record updated");
			break;
			
			case "add":System.out.println("enter the address");
			String add=sc.next(); 
				String query3 = "update empdetails set address='"+add+"' where name='"+uname+"'";
			st.executeUpdate(query3);
			System.out.println("one record updated");
			break;
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
