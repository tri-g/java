package dao;

import java.util.List;
import entity.Customer;
public interface CustomerDao {
	public void addCustomer();
	public List<Customer> getAllCustomers();
}
