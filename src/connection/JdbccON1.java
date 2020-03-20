package connection;

import java.sql.*;
import java.util.Scanner;

public class JdbccON1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?useSSL=false", "root",
					"1234");
			Statement st = con.createStatement();
			Scanner sc = new Scanner(System.in);
			ResultSet rs = st.executeQuery("select max(dept_id) from department");
			rs.next();
			int temp = rs.getInt(1);
			// int id = temp + 1;
		/*	System.out.println("how amny recorsd you want to enter");
			int n = sc.nextInt();*/

			/*for (int i = 0; i <= n; i++) {
				temp++;
				System.out.println("enter the name");
				String dept_name = sc.next();
				System.out.println("description");
				String description =sc.next();
				*/
			/*	String query = "insert into department(dept_id,dept_name,description) values(" + temp + ",'" + dept_name+ "','" + description +"')";*/
				String query = "update department set dept_name='market' where dept_id=102";
				st.executeUpdate(query);
				System.out.println("one record inserted");
			/*}*/

			System.out.println("done!");

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
