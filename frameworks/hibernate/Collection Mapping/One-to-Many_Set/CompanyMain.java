package mypack;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CompanyMain {

	public static void main(String[] args) {
		
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf =c.buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction t =session.beginTransaction();
		
		Employee e1 = new Employee();
		e1.setEname("Shreyash");
		e1.setSalary(78000);
		
		Employee e2 = new Employee();
		e2.setEname("Shiv");
		e2.setSalary(45000);
		
		Employee e3 = new Employee();
		e3.setEname("Shubham");
		e2.setSalary(65000);
		
		Employee e4 = new Employee();
		e4.setEname("Sachin");
		e4.setSalary(100000);
		
		Employee e5 = new Employee();
		e5.setEname("Tejas");
		e5.setSalary(25000);
		
		Set<Employee> l1 = new HashSet<Employee>();
		l1.add(e1);
		l1.add(e2);
		
		
		Set<Employee> l2  = new HashSet<Employee>();
		l2.add(e3);
		l2.add(e4);
		l2.add(e5);
		
		Department d1 = new Department();
		d1.setDname("Java Devloper");
		d1.setEmp(l1);
		
		Department d2 = new Department();
		d2.setDname("Web Devloper");
		d2.setEmp(l1);
		
//		Department d3 = new Department();
//		d3.setDname("Frontend Devloper");
//		d3.setEmp(l1);
//		
//		Department d4 = new Department();
//		d4.setDname("FullStack Devloper");
//		d4.setEmp(l2);
//		
//		Department d5 = new Department();
//		d5.setDname("Backend Devloper");
//		d5.setEmp(l2);
//		
		session.save(d1);
		session.save(d2);
//		session.save(d3);
//		session.save(d4);
//		session.save(d5);
		
		t.commit();
		System.out.println("Done..............!!");
		
		session.close();
		
		
		
	}

}
