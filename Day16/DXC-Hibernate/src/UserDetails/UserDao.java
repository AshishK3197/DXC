package UserDetails;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserDao {
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	
	
	public void saveUser(User user) {
		Session session=factory.openSession();
		Transaction tx= session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();
	}

}
