package mypack;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class QuestionMain {
	
	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf = c.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		Question q1 = new Question();
		q1.setQname("What is Hibernate");
		 
		List<String> a1= new ArrayList<String>();
		a1.add("Java Framework");
		a1.add("Auto table Creation");
		a1.add("Simplifies Databases Connecction");
		
		q1.setAnswers(a1);
		
		
		Question q2 = new Question();
		q2.setQname("What is Java");
		
		List<String>a2 = new ArrayList<String>();	
		a2.add("Pure OOP Lang");
		a2.add("Platform Independent");
		a2.add("Secure");
		
		q2.setAnswers(a2);
		
		session.persist(q1);
		session.persist(q2);
		
		t.commit();
		session.close();
	}
}
