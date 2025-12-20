package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		
		SessionFactory  sf=c.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t =session.beginTransaction();
		
		Employee emp = new Employee();
		emp.setEname("Hashal");
		
		Regular_Employee re = new Regular_Employee();
		re.setSalary(99000);
		re.setBonus(15000);
		
		Contract_Employee ce = new Contract_Employee();
		ce.setContract_duration(8);
		ce.setRate_per_hour(1500);
		
		session.save(emp);
		session.save(re);
		session.save(ce);
		
		t.commit();
		System.out.println("Done.....!!!");	
	}

}
