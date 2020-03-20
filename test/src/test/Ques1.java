package test;
import java.sql.*;
import java.util.Scanner;
public class Ques1 {
	
	public static void main(String[] args) 
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the username");
			String name=sc.next();
			System.out.println("Enter the email");
			String email=sc.next();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?useSSL=false","root","1234");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select name,email from empdetails where name='"+name+"' and email='"+email+"'");
			if(rs.next())
			{
			String uname=rs.getString("name");
			String mail=rs.getString("email");
			if((uname).equals(name) && (mail).equals(email)) 
			{
				System.out.println("You have logged-in successfully");
			}
			else 
			{
					System.out.println("invalid username and email");
					System.exit(0);
			}
			}
			}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}


}
