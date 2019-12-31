package dao;
import entities.Customer;
import exceptions.CustomerNotFoundException;
import java.util.*;

public class CustomerDaoImpl implements CustomerDao{
	private Map<String,Customer> store=new HashMap<>();
	
	@Override
	public void addCustomer(Customer c) {
		store.put(c.getMobileNo(), c);
		 
	}
	@Override
    public Customer findCustomerBymobileNo(String mobileNo) {
		Customer c=store.get(mobileNo);
		if(c==null) {
			throw new CustomerNotFoundException("customer not found for mobileNo=" + mobileNo);

		}
		return c;
	}
	@Override
    public Set<Customer> allCustomer(){
		Collection<Customer> Customer = store.values();
		Set<Customer> CustomerSet=new HashSet<>(Customer);
		return CustomerSet;
	}
	

}
