package dao;

import java.util.List;
import entity.Employee;
public interface EmployeeDao {
	public void addEmployee();
	public List<Employee> getAll();

}
