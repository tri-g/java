package testdao;
import daoImpl.EmployeeDaoImpl;
import daoImpl.CustomerDaoImpl;
public class test {
	public static void main(String[] args) {
		EmployeeDaoImpl emp=new EmployeeDaoImpl();
		emp.addEmployee();
		(emp.getAll()).stream().forEach(p->System.out.println(p.id+" "+p.name+" "+p.age+" "+p.address));
		System.out.println("-----------------------------------------------------------------------");
		CustomerDaoImpl cust=new CustomerDaoImpl();
		(cust.getAllCustomers()).stream().forEach(p->System.out.println(p.id+" "+p.name+" "+p.age+" "+p.address));
		
		
	}
}
