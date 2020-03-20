package daoImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.EmployeeDao;
import entity.Employee;
import util.ConnectionDaoUtil;
import java.sql.*;
public class EmployeeDaoImpl implements EmployeeDao{
	private Connection getConnection() throws SQLException
	{
		Connection con;
		con=ConnectionDaoUtil.getInstance().getConnection();
		return con;
	}
	public void addEmployee()
	{
		Scanner sc=new Scanner(System.in);
		try {
			Connection con=getConnection();
			Statement st=con.createStatement();
			Statement st1=con.createStatement();
			ResultSet rs=st.executeQuery("select max(id) from employee");
			rs.next();
			int i=rs.getInt(1);
			System.out.println("how many records u want 2 enter");
			int z=sc.nextInt();
			for(int j=0;j<z;j++)
			{
				i++;
				System.out.println("enter the name");
				String n=sc.next();
				System.out.println("enter the age");
				int a=sc.nextInt();
				System.out.println("enter the address");
				String ad=sc.next();
				st1.executeUpdate("insert into employee (id,name,age,address) values('"+i+"','"+n+"',"+a+",'"+ad+"')");
				System.out.println("one record updated");
			}
		}catch(Exception e)
			{
				System.out.println(e);
			}
	}
	public List<Employee> getAll()
	{
	List<Employee> listofemp=new ArrayList<Employee>();
	try {
		Connection con=getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select*from employee");
		while(rs.next())
		{
			int tempid=rs.getInt(1);
			String tempname=rs.getString(2);
			int tempage=rs.getInt(3);
			String tempadd=rs.getString(4);
			listofemp.add(new Employee(tempid,tempname,tempage,tempadd));
		}
	}catch(Exception e)
	{
		System.out.println(e);
	}
	return listofemp;
	}
}
