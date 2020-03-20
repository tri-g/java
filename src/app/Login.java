package app;

import java.sql.*;

public class Login {
	public void login(String uname)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?useSSL=true","root","1234");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select name from empdetails where name='"+uname+"'");
			if(rs.next())
			{
			String qname=rs.getString("name");
			if((qname).equals(uname)) {
			System.out.println("You have logged-in successfully");
			}
			else {
				System.out.println("invalid");
				System.exit(0);
			}
			}
			else
			{
				login(uname);
				System.exit(0);
			}
			
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
