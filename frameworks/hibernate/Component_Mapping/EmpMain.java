package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpMain {

	public static void main(String[] args) {
		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		
		SessionFactory sf=c.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction t=session.beginTransaction();
		
		
		Address a=new Address();
		a.setCity("Pune");
		a.setState("Maharashtra");
		a.setPincode(422101);
		
		
		Employee e=new Employee();
		e.setEmpname("Raghav");
		e.setEmpadd(a);
		
		session.persist(e);
		t.commit();
		session.close();

	}

}