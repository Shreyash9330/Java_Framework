package mypack;


import java.util.List;
import java.util.Scanner;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class BookMain {

	public static void main(String[] args) {
		
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		
		SessionFactory sf =c.buildSessionFactory();
		Session se = sf.openSession();
		Transaction t = se.beginTransaction();
		
		// Insert  code using hql
	
	/*	Scanner sc = new Scanner(System.in);
		Book b1 = new Book();
		System.out.println("Enter the book name and price");
		String bnm=sc.next();
		int pr =sc.nextInt();
		
		b1.setBname(bnm);
		b1.setBprice(pr);
		
		se.persist(b1);
		t.commit();
		se.close();
		
		*/
		
		
		// prints all records
	 
	/*	Query q1 = se.createQuery("from Book");
		List li =q1.list();
		for(Object temp:li)
		{
			Book b1=(Book)temp;
			System.out.println(b1.getBid() +" "+b1.getBname()+" "+b1.getBprice());
		}
		
		se.close();
	*/
		
	/*	Query q1 =se.createQuery("from Book");
		q1.setFirstResult(1);
		q1.setMaxResults(2);
		
		List li =q1.list();
		
		for(Object temp:li)
		{
			Book b1=(Book)temp;
			System.out.println(b1.getBid() +" "+b1.getBname()+" "+b1.getBprice());
		}
		se.close();
	*/
		
		//Update Query
		
	/*	Query q1=se.createQuery("update Book set bprice=:p,bname=:n where bid=:id");
		q1.setParameter("p", 799);
		q1.setParameter("n", "Dscipline");
		q1.setParameter("id", 4);
		
		q1.executeUpdate();
		System.out.println("Updated..............!!");
		se.close();
	*/
					//		Delete Query
		Query q1 = se.createQuery("Delete  from Book where bid =:id");
		
		q1.setParameter("id", 2);
		q1.executeUpdate();
		System.out.println("Deleted............!!");
		se.close();
	}

}
