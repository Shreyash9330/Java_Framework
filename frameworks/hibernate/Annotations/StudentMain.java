package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentMain {

	public static void main(String[] args) {
		
		Configuration c =  new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf =c.buildSessionFactory();
		Session session =sf.openSession();
		Transaction t= session.beginTransaction();
		
		Student s = new Student();
	
		s.setName("Abhijhit");
		s.setCity("KarveNagar");
		
		session.save(s);
		t.commit();
		session.close();
		System.out.println("Done!!!!!");

	}

}
