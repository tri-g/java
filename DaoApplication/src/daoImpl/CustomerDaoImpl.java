package daoImpl;
import dao.CustomerDao;
import entity.Customer;
import entity.Employee;
import util.ConnectionDaoUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class CustomerDaoImpl implements CustomerDao {
	private Connection getConnection() throws SQLException
	{
		Connection con;
		con=ConnectionDaoUtil.getInstance().getConnection();
		return con;
	}
	public void addCustomer()
	{
		
	}
	public List<Customer> getAllCustomers()
	{
		List<Customer> listofcust=new ArrayList<Customer>();
		try {
			Connection con=getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select*from customer");
			while(rs.next())
			{
				int temid=rs.getInt(1);
				String temname=rs.getString(2);
				int temage=rs.getInt(3);
				String temadd=rs.getString(4);
				listofcust.add(new Customer(temid,temname,temage,temadd));
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return listofcust;
	}

}
