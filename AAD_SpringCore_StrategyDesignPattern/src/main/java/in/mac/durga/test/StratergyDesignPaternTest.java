package in.mac.durga.test;
/**
 * @author mahesh 14-Apr-2019
 * Purpose:Create Vechicle bean  and automatically CNG Engine Starts.
 * GitHub Link
 *  https://github.com/Mahesh3309/GitUploadSpring.git
 */
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import in.mac.durga.beans.Vechicle;
public class StratergyDesignPaternTest {

	public static void main(String[] args) {
		BeanFactory factory = null;
		Vechicle viechle = null, viechle1 = null;
		// create IOC container
		factory = new XmlBeanFactory(new ClassPathResource("in/mac/durga/cfgs/ApplicationContext.xml"));
		// get Viechle obj
		viechle = factory.getBean("vechicle", Vechicle.class);
		// invoke methods
		viechle.move();
		viechle.park();
		System.out.println("................");

		viechle1 = factory.getBean("vechicle", Vechicle.class);
		// invoke methods
		viechle1.move();
		viechle1.park();
		System.out.println(viechle.hashCode() + "  " + viechle1.hashCode());
	}

}
