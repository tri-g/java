package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Case4 {
	public void case4(String uname)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?useSSL=true","root","1234");
			Statement st=con.createStatement();
			/*ResultSet rs=st.executeQuery("select dob from empdetails where name='"+uname+"'");
			rs.next();
			String dob=rs.getString("DOB");
			System.out.println(dob);*/
			
			String ad="Bangalore";
			ResultSet rs1=st.executeQuery("select sum(id) from empdetails where address='"+ad+"'");
			while(rs1.next())
			{
			
			
			String add=rs1.getString("sum(id)");
			System.out.println(add);
			
			}
			
	}catch(Exception e)
		{
		System.out.println(e);
		}
}
}