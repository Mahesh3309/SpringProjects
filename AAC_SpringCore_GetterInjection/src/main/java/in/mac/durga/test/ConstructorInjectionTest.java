package in.mac.durga.test;
/**
 * @author mahesh 14-Apr-2019
 * Constructor Injection
 * GITHUB Link
 *  https://github.com/Mahesh3309/GitUploadSpring.git
 */
import java.io.PrintStream;
import org.springframework.beans.factory.BeanFactory;

import in.mac.durga.beans.Customer;
import in.mac.durga.beans.Employee;
import in.mac.durga.beans.Marks;

public class ConstructorInjectionTest {
	public ConstructorInjectionTest() {
	}

	public static void main(String[] args) {
		BeanFactory factory = null;
		Employee emp = null;
		Marks mk = null;
		Customer cust = null;

		factory = new org.springframework.beans.factory.xml.XmlBeanFactory(
				new org.springframework.core.io.ClassPathResource("in/mac/durga/cfgs/ApplicationContext.xml"));

		emp = (Employee) factory.getBean("emp", Employee.class);
		System.out.println(emp);
		System.out.println(".....................");

		mk = (Marks) factory.getBean("marks", Marks.class);
		System.out.println(mk);
		System.out.println(".....................");
		cust = (Customer) factory.getBean("cust", Customer.class);
		System.out.println(cust);
	}
}