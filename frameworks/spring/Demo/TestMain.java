package mypack;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestMain {

    public static void main(String[] args) {

        // 1. Load XML file
        Resource r = new ClassPathResource("beanInfo.xml");

        // 2. Create Spring Container
        BeanFactory factory = new XmlBeanFactory(r);

        // 3. Get Bean Object
        Book b = (Book) factory.getBean("obj");

        // 4. Use Object
        System.out.println(b.getBid());
        System.out.println(b.getBname());
        System.out.println(b.getAuthor());
    }
}
