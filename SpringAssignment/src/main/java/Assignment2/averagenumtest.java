package Assignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class averagenumtest {
	
public static void main(String[] args) {
		

		ApplicationContext co=new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		AverageNum2 avg2=(AverageNum2)co.getBean("average");
		avg2.show();
		
		

}
}