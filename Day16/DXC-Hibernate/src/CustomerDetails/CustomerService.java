package CustomerDetails;

import java.util.ArrayList;

import CustomerDetails.CustomerDao;

public class CustomerService {

public static void main(String[] args) {
	

//Customer cust=new Customer();
//cust.setCustId(1);
//cust.setCustName("Singh");


CustomerDao dao=new CustomerDao();
//dao.saveCustomer(cust);

//dao.updateCustomer(1);

//dao.deleteCustomer(1);
dao.getCustomerbyId(1);

//
//ArrayList<Customer> customerList= dao.getCustomers();
//
//for(Customer customer1:customerList)
//{
//System.out.println(customer1.getCustName());
//
//}

System.out.println("DONE");

}

}

