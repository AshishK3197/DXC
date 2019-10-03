package Assessment2;
import Assessment2.Customer;

public class CustomerService {

	public static void main(String[] args) {
		CustomerDao dao = new CustomerDao();
		Customer customer = new Customer();
		
		customer.setCustName("Ashish");
		customer.setCustLastName("Kumar");
		customer.setAddress("Bokaro");
		
		dao.saveCustomer(customer);
		
		
	}

}
