package in.mac.durga.SpringFirstDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
      //  Car c=new Car(); //if i am changing source code or add new code then this line should be change,
        //So we are creating Interface VECHICLE.
        //c.drive();
      
        
        //Vechicle v=new Car();
       // v.drive();
        
        //Vechicle b=new Bike();
        //b.drive();
    ApplicationContext con=new ClassPathXmlApplicationContext();
        Vechicle v1=(Vechicle)con.getBean("vechicle");
    }
}
