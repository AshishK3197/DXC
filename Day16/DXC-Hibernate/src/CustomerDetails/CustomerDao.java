package CustomerDetails;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustomerDao {
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	
	
	public void saveCustomer(Customer customer)
	{
	
	Session session=factory.openSession();
	Transaction tx= session.beginTransaction();
	session.save(customer);
	tx.commit();
	}
	
	
	public void updateCustomer(int custId) {
		
			Session session=factory.openSession();
			Transaction tx= session.beginTransaction();
			Customer customer1 = new Customer();
			customer1.setCustId(custId);
			customer1.setCustName("Tyagi");
			session.saveOrUpdate(customer1);
			tx.commit();
			session.close();
		
		
	}
	
	public Customer getCustomerbyId(int custId) {
		Session session=factory.openSession();
		Transaction tx= session.beginTransaction();
		Customer cust = session.get(Customer.class, custId);
		return cust;
		
	}
	
	
	public ArrayList<Customer> getCustomers()
	{
	Session session=factory.openSession();
	Transaction tx= session.beginTransaction();
	ArrayList<Customer> customers=(ArrayList<Customer>)session.createQuery("from Customer").list();
	tx.commit();
	session.close();

	return customers;
	}
	
	
	
	public void deleteCustomer(int custId) {
	
		Session session = factory.openSession();
		Customer customer1=session.get(Customer.class, custId);
		if (customer1!=null) {
		Transaction tx= session.beginTransaction();
		session.delete(customer1);
		tx.commit();
		session.close();
	}




	}
	}

