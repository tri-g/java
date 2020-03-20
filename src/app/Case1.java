package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Case1 {
	public void case1()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?useSSL=true","root","1234");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from empdetails");
			while(rs.next())
			{
				int id=rs.getInt("id");
				String name=rs.getString("name");
				String dob=rs.getString("DOB");
				String email=rs.getString("email");
				long phone=rs.getLong("phone");
				String add=rs.getString("address");
				int salary=rs.getInt("salary");
				int dept=rs.getInt("dept");
				System.out.println(id+"       "+name+"     "+dob+"     "+email+"    "+"phone"+"    "+add+"    "+salary+"    "+dept);
			}
			}catch(Exception e)
			{
				System.out.println(e);
			}
	}

}
