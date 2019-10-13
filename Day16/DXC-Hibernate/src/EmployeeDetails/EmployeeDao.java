package EmployeeDetails;

import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

public class EmployeeDao {

	SessionFactory factory = new Configuration().configure().buildSessionFactory();

	public ArrayList<Employeetab> getEmp_cityinfo(String city){
		Session session= factory.openSession();
		Transaction tx=session.beginTransaction();
		Criteria cr = session.createCriteria(Employeetab.class);
		cr.add(Restrictions.like("city", "B%"));

		ArrayList<Employeetab> emps=(ArrayList<Employeetab>)cr.list();
		return emps;
		
	}

	
	
	public ArrayList<Employeetab> getEmp_ageinfo(int empage){
		Session session= factory.openSession();
		Transaction tx=session.beginTransaction();
		Criteria cr = session.createCriteria(Employeetab.class);
		cr.add(Restrictions.gt("empage", 25));
		
		ArrayList<Employeetab> emps=(ArrayList<Employeetab>)cr.list();
		return emps;
	}

	
	public ArrayList<Employeetab> getEmp_age_cityinfo(int empage, String city){
		Session session= factory.openSession();
		Transaction tx=session.beginTransaction();
		Criteria cr = session.createCriteria(Employeetab.class);
		Criterion empageData = Restrictions.gt("empage", 25);
		Criterion cityData = Restrictions.ilike("city","Bangalore");
		LogicalExpression andExp = Restrictions.and(empageData, cityData);
		cr.add( andExp );
		
		ArrayList<Employeetab> emps=(ArrayList<Employeetab>)cr.list();
		return emps;
		
	}
	
	
	public ArrayList<Employeetab> getEmp_age_deptinfo(){
		Session session= factory.openSession();
		Transaction tx=session.beginTransaction();
		Criteria cr = session.createCriteria(Employeetab.class);
		Criterion empageData = Restrictions.gt("empage", 25);
		Criterion deptData = Restrictions.ilike("empdept","Sales");
		LogicalExpression orExp = Restrictions.or(empageData, deptData);
		cr.add( orExp );
		
		ArrayList<Employeetab> emps=(ArrayList<Employeetab>)cr.list();
		return emps;
		}
	
	
	public ArrayList<Employeetab> getEmp_deptinfo(String dept1, String dept2){
		Session session= factory.openSession();
		Transaction tx=session.beginTransaction();
		Criteria cr = session.createCriteria(Employeetab.class);
		Criterion dept1Data = Restrictions.ilike("empdept", dept1);
		Criterion dept2Data = Restrictions.ilike("empdept",dept2);
		LogicalExpression orExp = Restrictions.or(dept1Data, dept2Data);
		cr.add( orExp );

		ArrayList<Employeetab> emps=(ArrayList<Employeetab>)cr.list();
		return emps;
	}
}
	
	
	
	
	
