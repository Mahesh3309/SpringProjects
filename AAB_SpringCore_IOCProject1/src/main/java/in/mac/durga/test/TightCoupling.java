package in.mac.durga.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import in.mac.durga.beans.FlipCart;

/**
 * 
 * @author mahesh 13-Apr-2019 Purpose:To test Tight coupling in Application.
 *
 */

@SuppressWarnings("deprecation")
public class TightCoupling {

	public static void main(String[] args) {
		BeanFactory factory = null;
		FlipCart fpkt = null;

		 //create IOC container
		
		factory=new XmlBeanFactory(new ClassPathResource("in/mac/durga/cfgs/ApplicationContext.xml"));
		
		//get Target class obj
	
		fpkt=factory.getBean("fCart", FlipCart.class);
		
		//invoke the method
		
		System.out.println(fpkt.shopping(new String[]{"Big Laddu","Big Murthi","puja items","prasad items","decoration items"}));

	}

}
