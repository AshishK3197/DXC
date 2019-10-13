package StudentDetails;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDao {

	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	
	public ArrayList<Student> getStudByRnoSname(int rollno , String sname)
	{
	Session session= factory.openSession();
	Transaction tx=session.beginTransaction();
	Query query=session.createQuery("from Student s where s.rollno=:roll and lower(s.sname)=:name");
	query.setParameter("roll", rollno);
	query.setParameter("name", sname.toLowerCase());
	ArrayList<Student> studs=(ArrayList<Student>)query.list();
	return studs;
	}
}
