package Assignment15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testcom {
	
	public static void main(String args[]) {
		ApplicationContext objctx=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Customer obj=(Customer) objctx.getBean("objcom");
		obj.showcdetails();
		
	}
	
	

}
