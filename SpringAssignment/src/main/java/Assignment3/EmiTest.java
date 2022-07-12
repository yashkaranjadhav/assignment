package Assignment3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmiTest {
	
	public static void main(String[] args)
	{
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationcontext.xml");
		Emi objemi= (Emi) ctx.getBean("interest");
		objemi.dispaly();
		
	}

}
