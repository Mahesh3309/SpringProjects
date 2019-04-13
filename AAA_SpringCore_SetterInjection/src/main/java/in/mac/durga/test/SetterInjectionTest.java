package in.mac.durga.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import in.mac.durga.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource res=null;
		BeanFactory factory=null;
		Object  obj=null;
		WishMessageGenerator generator=null;

		//Location SpringBean Configuration file
		res=new FileSystemResource("src/main/java/in/mac/durga/cfg/ApplicationContext.xml");

		//Create IOC container(BeanFactory)
				factory=new XmlBeanFactory(res);
				
				//Get Bean(main bean)
				obj=factory.getBean("wish");
				
				//Type Casting
				generator=(WishMessageGenerator)obj;
				
				//Invoke Business Method
				
				System.out.println("Message::"+generator.GeneratorWishMessage("Mahesh Kharat"));
				

				
	}

}
