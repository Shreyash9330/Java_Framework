package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentMain {
	
	public static void main(String[] args) {
		
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		
		Student s = new Student();
		s.setRollno(2);
		s.setName("Shreyash");
		s.setCity("Pune");
		
		SessionFactory sf =c.buildSessionFactory();
		Session sc = sf.openSession();
		Transaction t = sc.beginTransaction();
		sc.persist(s);
		t.commit();
		System.out.println("Data added Sucessfully");
		sc.close();
	}
	
}
