package util;
import java.sql.*;
public class ConnectionDaoUtil {
	String ConURL="jdbc:mysql://localhost:3306/details?useSSL=false";
	String ConUser="root";
	String ConPw="1234";
	static ConnectionDaoUtil connectionfactory=null;
	
	public ConnectionDaoUtil()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public Connection getConnection() throws SQLException
	{
		Connection con=null;
		con=DriverManager.getConnection(ConURL,ConUser,ConPw);
		return con;
	}
	public static ConnectionDaoUtil getInstance()
	{
		if(connectionfactory==null)
		{
			connectionfactory=new ConnectionDaoUtil();
		}
		return connectionfactory;
	}
}
