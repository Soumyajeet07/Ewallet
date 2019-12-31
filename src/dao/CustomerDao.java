package dao;
import entities.Customer;
import java.util.Set;

public interface CustomerDao {
	void addCustomer(Customer c);

    Customer findCustomerBymobileNo(String mobileNo);

    Set<Customer> allCustomer();
}



