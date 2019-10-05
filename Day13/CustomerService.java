package Assessment2;
import java.text.SimpleDateFormat;
import java.util.Date;

import Assessment2.Customer;

public class CustomerService {

	public static void main(String[] args) {
		CustomerDao dao = new CustomerDao();
		Customer customer = new Customer();
		
		customer.setCustName("bhuvi");
		customer.setCustLastName("Kumar");
		customer.setAddress("Bokaro");
		try
		{
			String dob = "2018/13/05";
			SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy/dd/MM");
			Date dobConverted=dataFormat.parse(dob);
			customer.setDob(dobConverted);
			System.out.println(dao.saveCustomer(customer));
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		dao.saveCustomer(customer);
		
		
	}

}
