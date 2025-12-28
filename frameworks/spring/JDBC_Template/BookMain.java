package mypack;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BookMain {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		BookDao b1 = (BookDao)factory.getBean("bdao");
		
		Scanner sc = new Scanner(System.in);
		
		char choice;
		int id,p;
		String nm;
		int ch;
		int status;
		
		do
		{
			System.out.println("1.Add Book \n2.Update BookInfo \n3.Delete Book \n4.Display");
			System.out.println("Enter Your Choice :");
			
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter Book_id,BookName and BookPtice");
				id=sc.nextInt();
				nm = sc.next();
				p =sc.nextInt();
				status = b1.insertRec(new Book(id,nm,p));
				System.out.println("Sucess...."+status);
				break;
				
			case 2:
					System.out.println("Enter Book_id,BookName and BookPtice");
					id=sc.nextInt();
					nm=sc.next();
					p=sc.nextInt();
					status=b1.UpdateRec(new Book(id,nm,p));
					System.out.println("Sucess..."+status);
					break;
			
			case 3:
					System.out.println("Enter Book_Id");
					id=sc.nextInt();
					status=b1.deleteRec(new Book(id,"c",0));
					System.out.println("Sucess..."+status);
					break;
			case 4:
					b1.show();
			}
			System.out.println("Do you want to continue(y/n) ");
//			choice=(char)System.in.read();
			choice=sc.next().charAt(0);
			}while(choice!='n');
		}

	}