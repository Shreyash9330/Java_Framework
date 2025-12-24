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
		SessionFactory sf = c.buildSessionFactory();
		Session se = sf.openSession();
		Transaction t = se.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Choice : \n1)Inert Records\n2)Select All Records\n3)Update a Records\n4)Delete Record");
		int a = sc.nextInt();
		
		
		if(a==1) 
		{
				//Insert Query
			
				System.out.println("Enter the Book name and price");
				String nm=sc.next();
				int pr = sc.nextInt();
		
				BookInfo b1 = new BookInfo();
				b1.setBname(nm);
				b1.setBprice(pr);
					
				se.persist(b1);
				t.commit();		
				se.close();
			
		}
		else if(a==2)
		{
				//Print All Records
				Query q1 = se.createQuery("from BookInfo");
				List li = q1.list();
			
				for(Object temp:li)
				{
					BookInfo b1=(BookInfo)temp;
					System.out.println(b1.getBid() +" "+b1.getBname()+" "+b1.getBprice());
				}
					se.close();
		}
		else if(a==3)
		{
				// Update Records 
			
				Query q1=se.createQuery("update from BookInfo bname=:nm ,bprice=:pr where bid=:id");
				List li =  q1.list();
				q1.setParameter("pr", 799);
				q1.setParameter("nm", "Dscipline");
				q1.setParameter("id", 2);
			
				q1.executeUpdate();
				System.out.println("Updated..............!!");
				se.close();
		}
		else if(a==4)
		{
				//------------Delete Query  ------
				Query q1= se.createQuery("Delete from  BookInfo where bid =:id");
				q1.setParameter("id", 2);
				q1.executeUpdate();
				System.out.println("Deleted...............!!!!!!!!");
			
				se.close();
			
		}
		else
		{
				System.out.println("Sorry Invalid Choice..!!!!!!!!");
		}
		
		
		
		
	}
}
