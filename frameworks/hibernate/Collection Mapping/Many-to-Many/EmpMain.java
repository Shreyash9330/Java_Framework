package mypack;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpMain {

	public static void main(String[] args) {
		 
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf = c.buildSessionFactory();
		Session session =sf.openSession();
		
		Transaction t = session.beginTransaction();
		
		Emp e1 =new Emp();
		e1.setEid(101);
		e1.setEname("Shreyash");
		
		Emp e2 =new Emp();
		e2.setEid(102);
		e2.setEname("Ganesh");
		
		Project p1 = new Project();
 		p1.setPid(201);
		p1.setPname("Student Managment");
		
		Project p2 = new Project();
		p2.setPid(202);
		p2.setPname("Bank Managment");
 		
 		List<Project> projectlist = new  ArrayList<Project>();
 		projectlist.add(p1);
 		projectlist.add(p2);
 		
 		List<Emp> empList = new ArrayList<Emp>();
 		empList.add(e1);
 		empList.add(e2);
 		
 		
 		e1.setProjects(projectlist);
 		e2.setProjects(projectlist);
 		
 		p1.setEmp(empList);
 		p2.setEmp(empList);
 		
 		
 		session.save(e1);
 		session.save(e2);
 		session.save(p1);
 		session.save(p2);
 		t.commit();
 		session.close();
 		System.out.println("Sucess...........!!");
	}

}
