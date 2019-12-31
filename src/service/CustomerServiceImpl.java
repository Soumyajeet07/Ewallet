package service;
import dao.CustomerDao;
import entities.Customer;
import exceptions.IncorrectMobileNoException;
import java.util.Set;

public class CustomerServiceImpl implements CustomerService {
	    private CustomerDao dao;

	    public CustomerServiceImpl(CustomerDao dao) {
	        this.dao = dao;
	    }

	    @Override
	    public void addCustomer(Customer c) {
	        dao.addCustomer(c);
	    }

	    @Override
	    public Customer findCustomerByMobileNo(String mobileNo) {
	        if (mobileNo ==null) {
	            throw new IncorrectMobileNoException("mobileNo is incorrect");
	        }
	        Customer c = dao.findCustomerBymobileNo(mobileNo);
	        return c;
	    }

	    @Override
	    public Set<Customer> allCustomer() {
	        Set<Customer> employees = dao.allCustomer();
	        return employees;
	    }
	}


