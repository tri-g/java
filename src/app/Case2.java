package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Case2 {
	public void case2()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?useSSL=false", "root",
					"1234");
			Statement st = con.createStatement();
			Scanner sc = new Scanner(System.in);
			ResultSet rs = st.executeQuery("select max(id) from empdetails");
			rs.next();
			int temp = rs.getInt(1);
			System.out.println("how many records you want to enter?");
			int n = sc.nextInt();
			for (int i = 0; i <= n; i++)
			{
				temp++;
				System.out.println("enter the name");
				String name = sc.next();
				System.out.println("enter the dob");
				String dob =sc.next();
				System.out.println("enter the email");
				String email = sc.next();
				/*System.out.println("enter the phone");
				Long phone = sc.nextLong();*/
				String query = "insert into empdetails(id,name,DOB,email) values(" +temp+ ",'" + name+ "','" +dob +"','" +email+ "')";
				st.executeUpdate(query);
				System.out.println("one record inserted");
			}
}catch(Exception e)
		{
	System.out.println(e);
		}
}
}