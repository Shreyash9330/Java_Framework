package mypack;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CompanyMain {

	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf = c.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		Employee e1= new Employee();
		e1.setEname("Ganesh");
		e1.setSalary(40000);
		
		Employee e2 = new Employee();
		e2.setEname("Harshal");
		e2.setSalary(60000);
		
		Employee e3 = new Employee();
		e3.setEname("Abhijeet");
		e3.setSalary(90000);
		
		Employee e4=new Employee();
		e4.setEname("Vinit");
		e4.setSalary(50000);
		
		Employee e5=new Employee();
		e5.setEname("Pratik");
		e5.setSalary(50000);
		
		List<Employee> l1= new ArrayList<Employee>();
		l1.add(e1);
		l1.add(e2);

		List<Employee> l2 = new ArrayList<Employee>();
		l2.add(e3);
		l2.add(e4);
		l2.add(e5);
		
		Department d1 = new Department();
		d1.setDname("IT");
		d1.setEmp(l1);
		
		Department d2 = new Department();
		d2.setDname("Devloper");
		d2.setEmp(l2);
		
		session.save(d1);
		session.save(d2);
		t.commit();
		System.out.println("Done...!!!");
		session.close();
	}

}
