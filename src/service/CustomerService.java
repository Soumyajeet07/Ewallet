package service;
import entities.Customer;
import java.util.*;

public interface CustomerService {
	void addCustomer(Customer c);

    Customer findCustomerByMobileNo(String mobileNo);

    Set<Customer> allCustomer();
}


