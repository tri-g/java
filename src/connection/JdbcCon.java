package connection;
import java.sql.*;
public class JdbcCon {
	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?useSSL=true","root","1234");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select *from department");
		System.out.println("dept_id"+"   "+"dept_name"+"   "+"description");
		while(rs.next())
		{
			int id=rs.getInt("dept_id");
			String dname=rs.getString("dept_name");
			String des=rs.getString("description");
			System.out.println(id+"       "+dname+"     "+des);
		}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	

}
